package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tickets = 0;
        while (tickets != -1) {
            System.out.println("Please enter number of tickets: ");
            tickets = scanner.nextInt();
            if (tickets != -1) {
                System.out.println("How many round-trip tickets: ");
                int roundTrip = scanner.nextInt();
                while (roundTrip > tickets) {
                    System.out.println("Input error. Must lower than number of tickets!");
                    System.out.println("\nHow many round-trip tickets: ");
                    roundTrip = scanner.nextInt();
                }
                Ticket ticket = new Ticket(tickets, roundTrip);
                ticket.print();

            } else {
                System.out.println("\n========== end ==========");
            }
        }

    }
}
