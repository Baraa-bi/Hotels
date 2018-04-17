package com.Hotels.hotels.Controllers;


import com.Hotels.hotels.Models.Offers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


@Controller
public class HotelsController {


    @RequestMapping(value = "/hotels")
    public String getHotels(
            @RequestParam(name = "destinationName", required = false) String destinationName,
            @RequestParam(name = "lengthOfStay", required = false) String lengthOfStay,
            @RequestParam(name = "minTripStartDate", required = false) String minTripStartDate,
            @RequestParam(name = "maxTripStartDate", required = false) String maxTripStartDate,
            Model model) {

        // handling the request params
 
           destinationName = destinationName!=null && !destinationName.isEmpty() ? "&destinationName=" + destinationName : "";
           lengthOfStay = lengthOfStay!=null && !lengthOfStay.isEmpty() ? "&lengthOfStay=" + lengthOfStay : "";
           minTripStartDate = minTripStartDate!=null && !minTripStartDate.isEmpty() ? "&minTripStartDate=" + minTripStartDate : "";
           maxTripStartDate = maxTripStartDate!=null && !maxTripStartDate.isEmpty() ? "&maxTripStartDate=" + maxTripStartDate : "";
        


        /*
                here RestTemplate will make the request to the api
                and then the response will be handled by the created MODELS :D
                after that I attached the response to the model to be able to use
                it with THYMELEAF
         */


        RestTemplate restTemplate = new RestTemplate();
        Offers offers = restTemplate.getForObject("https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel"
                        + destinationName
                        + lengthOfStay
                        + minTripStartDate
                        + maxTripStartDate
                , Offers.class);

        model.addAttribute("hotels", offers.getOffers().getHotel());


        // the name of the view to be returned (hotels.html)

        return "hotels";
    }


}
