package com.bhusalmanish;

import java.util.*;

public class Theater {

    private final String theaterName;
    private List<Seat> seats=new ArrayList<>();

    public String getTheaterName() {
        return theaterName;
    }


    public Theater(String theaterName, int numRows, int seatsPerRow) {
        this.theaterName = theaterName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {   // code block to create seats for theater  based on num of rows and seat per rows
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price=12.00;
                if((row<'D') && (seatNum>=4 && seatNum<=9)){
                    price=14.00;
                }
                else if((row>'F')|| (seatNum<4||seatNum>9)){
                    price=7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum),price); // new seat created by passing to constructor
                seats.add(seat); // seat object added to arraylist seats
            }
        }
    }

    public boolean reserveSeat(String seatNumber){

            Seat requestedSeat=new Seat(seatNumber,0);
            int foundSeat=Collections.binarySearch(seats,requestedSeat,null);  // will use compareTo method
        // that we have already implemented below.
            if(foundSeat>=0){
                 return seats.get(foundSeat).reserve();
             }
             else{
                System.out.println("There is no seat"+ seatNumber);
                return false;
            }

    }

    //for testing

    public Collection<Seat> getSeats(){  // function used to display all the seats available in theater
       return seats;
    }

    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private double price;
        private boolean reserved=false;

        public Seat(String seatNumber,double price){   // actual seat created here
            this.price=price;
            this.seatNumber=seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {   // this function decides if seat is available or already reserved
            if (!this.reserved) {
                 this.reserved = true;
                 System.out.println("Seat " +seatNumber+" reserved");
                 return true;
            }
            else{
             return false;
            }
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved=false;
                System.out.println("Reservation of Seat "+seatNumber+" cancelled");
                return true;
            }
            else{
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }
    }
}










