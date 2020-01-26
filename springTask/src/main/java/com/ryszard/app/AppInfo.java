package com.ryszard.app;

import com.ryszard.model.DarkSkyInfo;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;


public class AppInfo {


    private static final String KEY = "apiKey" ;
    private static final String URL = "url" ;

    private RestTemplate restTemplate;

    private HttpEntity getHeaders()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 " +
                "(KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity headersEntity = new HttpEntity(headers);
        return headersEntity;
    }

    public AppInfo() {
        this.restTemplate = restTemplate;
    }

    public DarkSkyInfo getDarkSkyInfo(String coordinates){
        String url = URL + KEY + "/" + coordinates;
        return (DarkSkyInfo) (restTemplate.exchange(url, HttpMethod.GET, getHeaders(), DarkSkyInfo.class)).getBody();
    }
}
