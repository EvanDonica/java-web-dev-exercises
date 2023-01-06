package org.launchcode.java;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        double radius;

        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your circle?");
        radius = input.nextDouble();

        System.out.println("The area of a circle of radius "+ radius+ " is: " + Circle.getArea(radius));

    }

}
