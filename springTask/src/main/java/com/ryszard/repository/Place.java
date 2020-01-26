package com.ryszard.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "place")
public class Place {


    @Id
    @GeneratedValue
    private long id;

    private double latitude;
    private double longitude;
    private String timeZone;
    private double humidity;
    private double windSpeed;
    private Date timeStamp;

    public Place() {
    }

    public Place(double latitude, double longitude, String timeZone, double humidity, double windSpeed, Date timeStamp) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.timeZone = timeZone;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.timeStamp = timeStamp;
    }
}
