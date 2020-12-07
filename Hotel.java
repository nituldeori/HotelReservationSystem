package com.hotelreservation;

public class Hotel {
    public String hotelName;
    public int rateRegular;
    public int rateWeekend;

    public Hotel(String hotelName,int rateRegular,int rateWeekend){
        this.hotelName=hotelName;
        this.rateRegular=rateRegular;
        this.rateWeekend=rateWeekend;
    }

    public Hotel(String hotelName,int rateRegular){
        this.hotelName=hotelName;
        this.rateRegular=rateRegular;
    }

}
