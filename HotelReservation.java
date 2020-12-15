package com.hotelreservation;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.SUNDAY;

public class HotelReservation {
    public ArrayList<Hotel> hotelList = new ArrayList<>();

    public void addHotel(Hotel hotel) {
        hotelList.add(hotel);
    }

    public void printHotelList() {
        for (Hotel h : hotelList) {
            System.out.println("Hotel Name: " + h.hotelName + " RateRegular: " + h.rateRegular);
        }
    }

    public Hotel findCheapestHotelRegular(String date1, String date2) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate d1 = LocalDate.parse(date1, dtf);
        LocalDate d2 = LocalDate.parse(date2, dtf);
        long dayRange = ChronoUnit.DAYS.between(d1, d2)+1;
        System.out.println("Day Range: " + dayRange);
        long min = hotelList.get(0).rateRegular * dayRange;
        for (int i = 1; i < hotelList.size(); i++) {
            if (hotelList.get(i).rateRegular * dayRange < min) {
                min = hotelList.get(i).rateRegular * dayRange;
            }
        }
        System.out.println("Total Rate of Cheapest Hotel: " + min);
        for (Hotel h : hotelList) {
            if (h.rateRegular * dayRange == min) {
                return h;
            }
        }
        return null;
    }

    public void findCheapestRegularAndWeekday(String date1,String date2){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate start = LocalDate.parse(date1, dtf);
        LocalDate end = LocalDate.parse(date2, dtf);
        int lakeWoodPrice=0;
        int brideWoodPrice=0;
        int ridgeWoodPrice=0;
        while (!start.isAfter(end)){
            DayOfWeek day = DayOfWeek.of(start.get(ChronoField.DAY_OF_WEEK));
            switch (day){
                case SATURDAY:
                    lakeWoodPrice+=90;
                    brideWoodPrice+=50;
                    ridgeWoodPrice+=150;
                    break;
                case SUNDAY:
                    lakeWoodPrice+=90;
                    brideWoodPrice+=50;
                    ridgeWoodPrice+=150;
                    break;
                default:
                    lakeWoodPrice+=110;
                    brideWoodPrice+=150;
                    ridgeWoodPrice+=220;
                    break;
            }
            start = start.plusDays(1);
        }
        int min = Math.min(Math.min(lakeWoodPrice,brideWoodPrice),ridgeWoodPrice);
        if(min==lakeWoodPrice){
            System.out.println("Min Cost Hotel: Lakewood"+" Price: "+lakeWoodPrice);
        }
        if(min==brideWoodPrice){
            System.out.println("Min Cost Hotel: Bridgewood"+" Price: "+brideWoodPrice);
        }
        if(min==ridgeWoodPrice)
            System.out.println("Min Cost Hotel: Ridgewood"+" Price: "+ridgeWoodPrice);


    }


    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");
        HotelReservation HR = new HotelReservation();
        Hotel h1 = new Hotel("Lakewood", 110, 90,3);
        Hotel h2 = new Hotel("Bridgewood", 160, 50,4);
        Hotel h3 = new Hotel("Ridgewood", 220, 150,5);
        HR.addHotel(h1);
        HR.addHotel(h2);
        HR.addHotel(h3);
        HR.printHotelList();
        HR.findCheapestRegularAndWeekday("11 09 2020","12 09 2020");
    }


}
