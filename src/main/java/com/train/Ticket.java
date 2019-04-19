package com.train;

public class Ticket {

    int tickets;
    int roundTrip;

    public Ticket(int ticketsNumber, int roundTripNumber) {
        this.tickets = ticketsNumber;
        this.roundTrip = roundTripNumber;
    }

    public void print() {
        int total = ((tickets - roundTrip) * 1000 + (int) (roundTrip * 2000 * 0.9));
        System.out.println("Total tickets: " + tickets
                + "\nRound-trip: " + roundTrip
                + "\nTotal: " + total);

    }
}
