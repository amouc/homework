package com.train;

public class Ticket {
    int total;
    int round;

    public Ticket(int total,int round){
        this.total = total;
        this.round = round;
    }

    public void print(){
        double totalval = (total-round)*1000+round*2000*0.9;
        System.out.println("Total ticket:"+total+"\n"+"Round-trip:"+round+"\n"+"Total:"
                +totalval);
        //System.out.println("Total ticket:"+total+"\n"+"Round-trip:"+round+"\n"+"Total:"+(total-round)*1000+round*2000*0.9);
        //System.out.println((total-round)*1000);
        //System.out.println("Total:"+(total-round)*1000+round*2000*0.9);
    }
}
