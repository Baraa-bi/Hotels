package com.Hotels.hotels.Models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotel implements Serializable {

    HotelInfo hotelInfo;
    HotelDestination destination;

    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    public void setHotelInfo(HotelInfo hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public HotelDestination getDestination() {
        return destination;
    }

    public void setDestination(HotelDestination destination) {
        this.destination = destination;
    }
}
