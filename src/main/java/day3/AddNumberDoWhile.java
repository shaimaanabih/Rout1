package day3;

import java.util.Scanner;

public class AddNumberDoWhile {
     static void main(String[] args)  {
        Scanner sc = new Scanner (System.in);
        boolean flag; // false
        do {
            System.out.println("Enter first number");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number");
            double nun2 = sc.nextDouble();
            double sum = num1 + nun2;
            System.out.println("The sun is: " + sum);
            System.out.println("Would you like to sum other numbers? In Write Ture if you want to insert another number In if not write False");
            flag = sc.nextBoolean();
            if (flag == false) {
                System.out.println("Thank you for using this progras");
            }
        }
        while(flag);
     }
}
