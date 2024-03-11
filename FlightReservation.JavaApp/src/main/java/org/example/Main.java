package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //scanner object
        Scanner scanner = new Scanner(System.in);

        //create a list of flights
        Flight[] flights = {
                new Flight( "FL001", "Arusha", 100),
                new Flight("FL002", "Kampala", 150),
                new Flight("FL003", "Mogadishu", 200),
        };

        //a variable to  the user choice
        int userChoice;

        do {
            System.out.println("=====================================");
            System.out.println("\t\t\t\tWelcome To CPL Flight Reservation Application");
            System.out.println("=====================================");
            System.out.println("1. Book a Flight");
            System.out.println("2. Display passengers of a Flight");
            System.out.println("3. Exit");
            System.out.println("=====================================");
            System.out.println("Enter your choice: ");
            userChoice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("=====================================");

            switch (userChoice){
                case 1:
                    bookFlight(scanner, flights);
                    break;
                case 2:
                    displaypassenger(scanner, flights);
                    break;
                case 3:
                    System.out.println("Exiting the App...");
                    break;
                default:
                    System.out.println("Invalid choice, Please try again.");
            }

        }while(userChoice != 3);


        //close the scanner object
        scanner.close();
    }

    //create a method to book the flight
    public static void bookFlight(Scanner scanner, Flight[] flights){
        System.out.println("\nAvailable Flights");
        for (int i = 0; i < flights.length; i++){
            System.out.println((i + 1) + ". " + flights[i].flightNumber + " - " + flights[i].destination); // 1. FL001 - kampala 2. FL002 - Arusha ;
        }

        //ask the passenger for the flight number they wish to book
        System.out.println("Enter the flight number to book");
        int flightIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        if (flightIndex >= 0 && flightIndex <= flights.length){
            System.out.println("Enter your Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Your Passport Number: ");
            String passportNumber= scanner.nextLine();

            //add the passenger into the passenger list
            Passenger passenger = new Passenger(name, passportNumber);
            flights[flightIndex].addPassenger(passenger);
        }else {
            System.out.println("Invalid Flight Number!!!");
        }
    }

    // a method to display all the passenger of a flight
    public void displaypassenger(Scanner scanner, Flight[] flights) {
        System.out.print("Enter the flight number to display  passengers: ");
        String flightNumber = scanner.nextLine();

        boolean found = false;

        for (Flight flight : flights) {
            if (flight.flightNumber.equals(flightNumber)) {
                flight.displayPassengers();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Flight " + flightNumber + " not found!");
        }
    }
}










