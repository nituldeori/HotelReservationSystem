package com.hotelreservation;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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

    public Hotel findCheapestHotelRegular(String date1,String date2){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate d1= LocalDate.parse(date1,dtf);
        LocalDate d2=LocalDate.parse(date2,dtf);
        long dayRange= ChronoUnit.DAYS.between(d1,d2);
        System.out.println("Day Range: "+dayRange);
        long min=hotelList.get(0).rateRegular*dayRange;
        for(int i=1;i<hotelList.size();i++){
            if(hotelList.get(i).rateRegular*dayRange<min) {
                min = hotelList.get(i).rateRegular*dayRange;
            }
        }
        System.out.println("Total Rate of Cheapest Hotel: "+min*dayRange);
        for(Hotel h:hotelList){
            if(h.rateRegular*dayRange==min){
                return h;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");
        HotelReservation HR = new HotelReservation();
        Hotel h1 = new Hotel("Lakewood", 110);
        Hotel h2 = new Hotel("Bridgewood", 160);
        Hotel h3 = new Hotel("Ridgewood", 220);
        HR.addHotel(h1);
        HR.addHotel(h2);
        HR.addHotel(h3);
        HR.printHotelList();
        Hotel cheapest=HR.findCheapestHotelRegular("05 12 2020","06 12 2020");
    }


}
