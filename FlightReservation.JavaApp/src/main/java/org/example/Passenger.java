package org.example;

public class Passenger {

    //attributes
    String passengerName;
    String passengerPassportNumber;

    // constructor
    public Passenger (String passengerName, String passengerPassportNumber){
        this.passengerName = passengerName;
        this.passengerPassportNumber = passengerPassportNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPassengerPassportNumber() {
        return passengerPassportNumber;
    }
}
