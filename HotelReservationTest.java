package com.hotelreservation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HotelReservationTest {
    @Test
    public void testAddMethodOfHotelReservation(){
        HotelReservation HR=new HotelReservation();
        Hotel h1=new Hotel("Lakewood",110);
        Hotel h2=new Hotel("Bridgewood",160);
        Hotel h3=new Hotel("Ridgewood",220);
        HR.addHotel(h1);
        HR.addHotel(h2);
        HR.addHotel(h3);
        Assert.assertEquals("Lakewood",HR.hotelList.get(0).hotelName);
        Assert.assertEquals(110,HR.hotelList.get(0).rateRegular);
        Assert.assertEquals("Bridgewood",HR.hotelList.get(1).hotelName);
        Assert.assertEquals(160,HR.hotelList.get(1).rateRegular);
        Assert.assertEquals("Ridgewood",HR.hotelList.get(2).hotelName);
        Assert.assertEquals(220,HR.hotelList.get(2).rateRegular);
    }

    @Test

    public void testForCheapestHotel(){
        HotelReservation HR=new HotelReservation();
        Hotel h1=new Hotel("Lakewood",110);
        Hotel h2=new Hotel("Bridgewood",160);
        Hotel h3=new Hotel("Ridgewood",220);
        HR.addHotel(h1);
        HR.addHotel(h2);
        HR.addHotel(h3);
        Hotel cheapest=HR.findCheapestHotelRegular("05 12 2020","06 12 2020");
        Assert.assertEquals(h1,cheapest);
    }



}