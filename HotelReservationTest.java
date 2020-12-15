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

    @Test
    public void testAddMethodOfHotelReservationWithWeekendRate(){
        HotelReservation HR=new HotelReservation();
        Hotel h1=new Hotel("Lakewood",110,90,80,80,3);
        Hotel h2=new Hotel("Bridgewood",160,50,110,50,4);
        Hotel h3=new Hotel("Ridgewood",220,150,100,40,5);
        HR.addHotel(h1);
        HR.addHotel(h2);
        HR.addHotel(h3);
        Assert.assertEquals("Lakewood",HR.hotelList.get(0).hotelName);
        Assert.assertEquals(110,HR.hotelList.get(0).rateRegular);
        Assert.assertEquals(90,HR.hotelList.get(0).rateWeekend);
        Assert.assertEquals(3,HR.hotelList.get(0).rating);
        Assert.assertEquals(80,HR.hotelList.get(0).rateRegularReward);
        Assert.assertEquals(80,HR.hotelList.get(0).rateWeekendReward);
        Assert.assertEquals("Bridgewood",HR.hotelList.get(1).hotelName);
        Assert.assertEquals(160,HR.hotelList.get(1).rateRegular);
        Assert.assertEquals(50,HR.hotelList.get(1).rateWeekend);
        Assert.assertEquals(110,HR.hotelList.get(1).rateRegularReward);
        Assert.assertEquals(50,HR.hotelList.get(1).rateWeekendReward);
        Assert.assertEquals(4,HR.hotelList.get(1).rating);
        Assert.assertEquals("Ridgewood",HR.hotelList.get(2).hotelName);
        Assert.assertEquals(220,HR.hotelList.get(2).rateRegular);
        Assert.assertEquals(150,HR.hotelList.get(2).rateWeekend);
        Assert.assertEquals(100,HR.hotelList.get(2).rateRegularReward);
        Assert.assertEquals(40,HR.hotelList.get(2).rateWeekendReward);
        Assert.assertEquals(5,HR.hotelList.get(2).rating);
    }



}