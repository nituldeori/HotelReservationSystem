package com.hotelreservation;

public class Hotel {
    public String hotelName;
    public int rateRegular;
    public int rateWeekend;
    public int rating;

    public Hotel(String hotelName,int rateRegular,int rateWeekend, int rating){
        this.hotelName=hotelName;
        this.rateRegular=rateRegular;
        this.rateWeekend=rateWeekend;
        this.rating=rating;
    }

    public Hotel(String hotelName,int rateRegular){
        this.hotelName=hotelName;
        this.rateRegular=rateRegular;
    }

}
