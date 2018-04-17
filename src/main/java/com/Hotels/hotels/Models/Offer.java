package com.Hotels.hotels.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Offer implements Serializable {

    @JsonProperty("Hotel")
    Hotel[] hotel;

    public Offer() {
    }

    public Hotel[] getHotel() {
        return hotel;
    }

    public void setHotel(Hotel[] hotel) {
        this.hotel = hotel;
    }
}
