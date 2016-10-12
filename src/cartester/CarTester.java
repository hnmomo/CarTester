/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

import java.util.Scanner;

/**
 *
 * @author jihua5758
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("input car info:make,model,year,price,width,speed");
        Scanner s=new Scanner(System.in);
        Car c1=new Car(s.next(),s.next(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt());
        System.out.println("input car info:year");
        Car c2=new Car(s.nextInt());
        Car c3=new Car();
        System.out.println("Car1:"+c1+"\nCar2:"+c2+"\nCar3:"+c3);
    }
    
}
