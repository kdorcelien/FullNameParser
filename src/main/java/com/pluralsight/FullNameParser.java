package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, please enter your full name, first middle last: ");
        String fullname = input.nextLine();
        int fullnameL = fullname.split("\\ ").length;
        System.out.println(fullnameL);

        String[] splitName = fullname.trim().split("\\ ");
        String firstName = splitName[0] + "\n";
        String lastName = splitName[1];


        System.out.print("First name: " + firstName);
        //System.out.print("Middle name: " + Name);
        System.out.print("Last name: " + lastName);





    }
}
