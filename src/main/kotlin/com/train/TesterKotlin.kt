package com.train

import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)
    var tickets = 0
    while (tickets != -1) {
        print("Please enter number of tickets: ")
        tickets = scanner.nextInt()
        if (tickets != -1) {
            print("How many round-trip tickets: ")
            var roundTrip = scanner.nextInt()
            while (roundTrip > tickets) {
                println("Input error. Must lower than number of tickets!")
                println("How many round-trip tickets: ")
                roundTrip = scanner.nextInt()
            }
            var ticketKotlin = TicketKotlin(tickets, roundTrip)
            ticketKotlin.print()
        } else {
            println("\n========== end ==========")
        }

    }

}

class TicketKotlin(var tickets: Int, var roundTrip: Int) {
    fun print() {
        var total = ((tickets - roundTrip) * 1000 + (roundTrip * 2000 * 0.9).toInt())
        println(
            "Total tickets: " + tickets
                    + "\nRound-trip: " + roundTrip
                    + "\nTotal: " + total
        )
    }
}