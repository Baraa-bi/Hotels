package com.Hotels.hotels.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Offers implements Serializable {

    private Offer offers;

    public Offers(Offer offers) {

        this.offers = offers;
    }

    public Offers() {
    }

    @Override
    public String toString() {
        return "Offers{" +
                "offers=" + offers +
                '}';
    }

    public Offer getOffers() {
        return offers;
    }

    public void setOffers(Offer offers) {
        this.offers = offers;
    }
}
