package com.Kotlin

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    val count = scanner.nextInt()
    print("How many round-trip tickets:")
    val round = scanner.nextInt()
    val ticket = Ticket(count,round)
    ticket.print()


}

class Ticket(var count: Int,var round: Int) {

    fun print(){
        print("Total tickets: $count  Round-trip: $round Total: ${(count - round) * 1000 + round * 1800}")
    }


}