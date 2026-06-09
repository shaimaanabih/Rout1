package day2;

import java.util.Scanner;

public class ConditionalStatement {
    static void main(String[] args){
        Scanner cs = new Scanner(System.in);
//        System.out.println("Enter your age, please!");
//
//        int personAge = cs.nextInt();
//
//        System.out.println("your age is : " + personAge );
//
//        String status = personAge >= 18 ? "good to vote" : "not good to vote";
//        System.out.println("your status is :" + status );
//
//        if (personAge >= 18 ) System.out.println("you are good to vote");
//
//        else
//            System.out.println("you are not good to vote");

//          Program to check even or odd

        System.out.println("Enter a number to decide even or odd");
        int number = cs.nextInt();

        if (number >= 0) {
            if (number == 0) {
                System.out.println("The number is zero");
            } else if (number % 2 == 0) {
                System.out.println("The number " + number + " is even");
            } else {
                System.out.println("The number " + number + " is odd");
            }
        }
        else
            System.out.println("Negative number is not allowed");


    }
}
