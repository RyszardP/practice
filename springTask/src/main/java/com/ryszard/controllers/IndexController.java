package com.ryszard.controllers;


import com.ryszard.app.AppInfo;
import com.ryszard.model.DarkSkyInfo;
import com.ryszard.repository.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class IndexController {

    @Autowired
    private ApplicationContext applicationContext;



    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "index.jsp";
    }


    @RequestMapping(path = "/result", method = RequestMethod.GET)
    public String result(HttpServletRequest request, Model model,
                         @RequestParam(value = "latitude",required = false) String latitude,
                         @RequestParam(value = "longitude",required = false) String longitude)

    { String coordinates = latitude + "," + longitude;
        DarkSkyInfo darkSkyInfo = (new AppInfo().getDarkSkyInfo(coordinates));
        String timeZone = darkSkyInfo.getTimezone();
        String summary = darkSkyInfo.getCurrently().getSummary();
        double humidity = darkSkyInfo.getCurrently().getHumidity();
        double windSpeed = darkSkyInfo.getCurrently().getWindSpeed();

        model.addAttribute("timezone", timeZone);
        model.addAttribute("time",ConvertEpochToDateString(darkSkyInfo.getCurrently().getTime()));
        model.addAttribute("summary", summary);
        model.addAttribute("humidity", humidity);
        model.addAttribute("windSpeed", windSpeed);

        return "result.jsp";
    }
    private String ConvertEpochToDateString(Long epochTime)
    {
        Date currentTime = new Date(epochTime * 1000);
        return currentTime.toString();
    }

}
