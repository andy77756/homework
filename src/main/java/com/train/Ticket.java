package com.train;

public class Ticket {
    int count;
    int round;
    int price;


    public Ticket(int count, int round) {
        this.count = count;
        this.round = round;
        this.price = ((count-round)*1000)+(round*1800);
    }


    public void print(){
        System.out.print("Total tickets:" + "\t" + count + "\t" + "Round-trip:" + "\t" + round + "\t" +
                " Total:" + "\t" + price);
    }

}
