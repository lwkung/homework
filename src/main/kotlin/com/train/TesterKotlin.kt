package com.train

import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var tickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundTrip = scanner.nextInt()
    var ticketKotlin = TicketKotlin(tickets, roundTrip)
    ticketKotlin.print()
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