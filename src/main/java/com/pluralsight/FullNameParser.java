package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, please enter your full name, first middle last: ");
        String fullname = input.nextLine();
        // System.out.println(fullname.trim());

        String[] splitName = fullname.trim().split("\\ ");
        String firstName = splitName[0];
        String lastName = splitName[1];

        System.out.print(firstName + " " + lastName);




    }
}
