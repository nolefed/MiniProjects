package com.bhusalmanish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theater theater=new Theater("Olympian",8,12);
        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);    //it is shallow copy. It copies one arraylist to another arraylist
        // just a common version of object would be shared between the two lists. // deep copy also exists

        printList(seatCopy);

       /* seatCopy.get(1).reserve();
        if(theater.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        }
        else{
            System.out.println("Seat already reserved");
        }*/

       Collections.shuffle(seatCopy);
       printList(seatCopy);
       sortList(seatCopy);
        System.out.println("Printing sorted seatcopy ");
        printList(seatCopy);

    }

    public static void printList(List<Theater.Seat> list){
        for(Theater.Seat seat: list){
            System.out.print(" "+seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==========================================================================================");
    }

    public static void sortList(List<? extends Theater.Seat> list){
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }







}
