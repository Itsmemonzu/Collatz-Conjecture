package com.itsmemonzu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number = 0;
        while (number == 0) {
            System.out.println("Type a number: ");
            Scanner newNumber = new Scanner(System.in);
            int typedNumber = newNumber.nextInt();
            number = number + typedNumber;}

        int i = 0;

        while (number != 1) {
            if (number % 2 == 0){
                number = (number / 2);
                System.out.println(number);
            } else {
                number = (3 * number + 1);
                System.out.println(number);
            }
            break;
        }

        System.out.println(number);

    }
}
