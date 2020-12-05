package com.hotelreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {
    public ArrayList<Hotel> hotelList=new ArrayList<>();

    public void addHotel(Hotel hotel){
        hotelList.add(hotel);
    }

    public void printHotelList(){
        for(Hotel h:hotelList){
            System.out.println("Hotel Name: "+h.hotelName+" RateRegular: "+h.rateRegular);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");
        HotelReservation HR=new HotelReservation();
        Hotel h1=new Hotel("Lakewood",110);
        Hotel h2=new Hotel("Bridgewood",160);
        Hotel h3=new Hotel("Ridgewood",220);
        HR.addHotel(h1);
        HR.addHotel(h2);
        HR.addHotel(h3);
        HR.printHotelList();
    }
}
