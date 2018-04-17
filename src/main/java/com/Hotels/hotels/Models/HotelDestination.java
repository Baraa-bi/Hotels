package com.Hotels.hotels.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelDestination {

    Long regionID;
    String shortName;
    String country;
    String province;
    String city;
    String tla;
    String nonLocalizedCity;
    Long hotelId;

    public HotelDestination() {
    }

    public HotelDestination(Long regionID, String shortName, String country, String province, String city, String tla, String nonLocalizedCity, Long hotelId) {

        this.regionID = regionID;
        this.shortName = shortName;
        this.country = country;
        this.province = province;
        this.city = city;
        this.tla = tla;
        this.nonLocalizedCity = nonLocalizedCity;
        this.hotelId = hotelId;
    }

    public HotelDestination(Long regionID, String shortName, String country, String province, String city, String tla, String nonLocalizedCity) {
        this.regionID = regionID;
        this.shortName = shortName;
        this.country = country;
        this.province = province;
        this.city = city;
        this.tla = tla;
        this.nonLocalizedCity = nonLocalizedCity;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Long getRegionID() {

        return regionID;
    }

    public void setRegionID(Long regionID) {
        this.regionID = regionID;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTla() {
        return tla;
    }

    public void setTla(String tla) {
        this.tla = tla;
    }

    public String getNonLocalizedCity() {
        return nonLocalizedCity;
    }

    public void setNonLocalizedCity(String nonLocalizedCity) {
        this.nonLocalizedCity = nonLocalizedCity;
    }

    @Override
    public String toString() {
        return "HotelDestination{" +
                "regionID=" + regionID +
                ", shortName='" + shortName + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", tla='" + tla + '\'' +
                ", nonLocalizedCity='" + nonLocalizedCity + '\'' +
                '}';
    }
}
