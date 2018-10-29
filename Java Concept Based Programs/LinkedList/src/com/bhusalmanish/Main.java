package com.bhusalmanish;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Customer customer=new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer=customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for " + customer.getName()+ "is" + customer.getBalance());

        ArrayList<Integer> inList=new ArrayList<Integer>();
        inList.add(1);
        inList.add(3);
        inList.add(4);

        for(int i=0;i<inList.size();i++){
            System.out.println(i+ ":"+ inList.get(i));
        }

        inList.add(1,2);

        for(int i=0;i<inList.size();i++){
            System.out.println(i+ ":"+ inList.get(i));
        }

    }
}
