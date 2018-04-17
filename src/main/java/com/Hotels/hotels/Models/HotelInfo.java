package com.Hotels.hotels.Models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;


@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelInfo implements Serializable {

    Long hotelId;
    String hotelName;
    String localizedHotelName;
    String hotelDestination;
    String hotelCity;
    String hotelImageUrl;
    double hotelLatitude;
    double hotelLongitude;
    double hotelStarRating;
    int hotelGuestReviewRating;
    int hotelReviewTotal;
    boolean vipAccess;
    boolean isOfficialRating;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", localizedHotelName='" + localizedHotelName + '\'' +
                ", hotelDestination='" + hotelDestination + '\'' +
                ", hotelCity='" + hotelCity + '\'' +
                ", hotelImageUrl='" + hotelImageUrl + '\'' +
                ", hotelLatitude=" + hotelLatitude +
                ", hotelLongitude=" + hotelLongitude +
                ", hotelStarRating=" + hotelStarRating +
                ", hotelGuestReviewRating=" + hotelGuestReviewRating +
                ", hotelReviewTotal=" + hotelReviewTotal +
                ", vipAccess=" + vipAccess +
                ", isOfficialRating=" + isOfficialRating +
                '}';
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public String getLocalizedHotelName() {
        return localizedHotelName;
    }

    public void setLocalizedHotelName(String localizedHotelName) {
        this.localizedHotelName = localizedHotelName;
    }

    public String getHotelDestination() {
        return hotelDestination;
    }

    public void setHotelDestination(String hotelDestination) {
        this.hotelDestination = hotelDestination;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public String getHotelImageUrl() {
        return hotelImageUrl;
    }

    public void setHotelImageUrl(String hotelImageUrl) {
        this.hotelImageUrl = hotelImageUrl;
    }

    public double getHotelLatitude() {
        return hotelLatitude;
    }

    public void setHotelLatitude(double hotelLatitude) {
        this.hotelLatitude = hotelLatitude;
    }

    public double getHotelLongitude() {
        return hotelLongitude;
    }

    public void setHotelLongitude(double hotelLongitude) {
        this.hotelLongitude = hotelLongitude;
    }

    public double getHotelStarRating() {
        return hotelStarRating;
    }

    public void setHotelStarRating(double hotelStarRating) {
        this.hotelStarRating = hotelStarRating;
    }

    public int getHotelGuestReviewRating() {
        return hotelGuestReviewRating;
    }

    public void setHotelGuestReviewRating(int hotelGuestReviewRating) {
        this.hotelGuestReviewRating = hotelGuestReviewRating;
    }

    public int getHotelReviewTotal() {
        return hotelReviewTotal;
    }

    public void setHotelReviewTotal(int hotelReviewTotal) {
        this.hotelReviewTotal = hotelReviewTotal;
    }

    public boolean isVipAccess() {
        return vipAccess;
    }

    public void setVipAccess(boolean vipAccess) {
        this.vipAccess = vipAccess;
    }

    public boolean isOfficialRating() {
        return isOfficialRating;
    }

    public void setOfficialRating(boolean officialRating) {
        isOfficialRating = officialRating;
    }
}
