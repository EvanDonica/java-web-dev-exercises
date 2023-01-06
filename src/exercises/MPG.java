package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args){
        double gas;
        double miles;
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        miles = input.nextDouble();

        System.out.println("How many gallons of gas did you use?");
        gas = input.nextDouble();


        System.out.println("MPG: " + miles/gas);

    }
}
