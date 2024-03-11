package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Flight {

    // attributes
    public String flightNumber;
     String destination;
     int capacity;
     ArrayList<Passenger> passengers;


    // constructor
    public Flight(String flightNumber, String destination, int capacity){
        this .flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity; //100
        this.passengers = new ArrayList<>();  //90
    }

    //a method to add a new passenger to the flight -> return boolean value
    public boolean addPassenger(Passenger passenger){
        if (passengers.size() < capacity){
            passengers.add(passenger);
            System.out.println("Passenger " + passenger.getPassengerName() + ", Added To Flight Number: " + flightNumber);
            return true;
        }else{
            System.out.println("Flight : " + flightNumber + " is full, cannot add passenger " + passenger.getPassengerName());
            return false;
        }
    }
    //a method to display all passengers
    public void displayPassengers(){
        System.out.println("\t\t\t\tPassengers for Flight" + flightNumber + ":");
        for(Passenger passenger : passengers){
            System.out.println("Passenger Name: " + passenger.getPassengerName() + ", Passport Number: " + passenger.getPassengerPassportNumber());
        }
    }
    }













