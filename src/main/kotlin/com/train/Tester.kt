package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of ticket:")
    var total = scanner.nextInt()
    print("How many round-trip tickets:")
    var round = scanner.nextInt()
    val ticket = Ticket1(total,round)
    ticket.print()

}

class Ticket1(var total:Int,var round:Int){
    var totalval:Double = (total-round)*1000+round*2000*0.9
    fun print(){
        println("Total ticket:$total"+"\n"+"Round-trip:$round"+"\n"+
                "Total:$totalval")
    }
}