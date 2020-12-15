package com.hotelreservation;

public class Hotel {
    public String hotelName;
    public int rateRegular;
    public int rateWeekend;
    public int rateRegularReward;
    public int rateWeekendReward;
    public int rating;

    public Hotel(String hotelName,int rateRegular,int rateWeekend, int rateRegularReward,int rateWeekendReward, int rating){
        this.hotelName=hotelName;
        this.rateRegular=rateRegular;
        this.rateWeekend=rateWeekend;
        this.rateRegularReward=rateRegularReward;
        this.rateWeekendReward=rateWeekendReward;
        this.rating=rating;
    }

    public Hotel(String hotelName,int rateRegular){
        this.hotelName=hotelName;
        this.rateRegular=rateRegular;
    }

}
