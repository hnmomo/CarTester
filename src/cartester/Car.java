/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *
 * @author jihua5758
 */
public class Car {
    public String make,model;
    public int year,price,width,speed;
    //default
    public Car(){
        this("dsfgfhi","dasfds",1929,1000,9999,2);
    }
    public Car(int year){
        this("dsfgfhi","dasfds",year,1000,9999,2);
    }
    //constructor
    public Car(String make,String model,int year,int price,int width,int speed){
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
        this.width=width;
        this.speed=speed;
    }
    //output car message
    public String toString(){
        return "the car is "+make+" "+model+" $"+price+" "+speed+"km/h"+" "+width+"meters long";
    }
    //make noise
    public void horn() {
        System.out.println("ahhhhhh");
    }
}
