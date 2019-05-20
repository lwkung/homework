package com.box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Box box3 = new Box3();
        Box box5 = new Box5();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object's 「length」:");
        float length = scanner.nextFloat();
        System.out.println("Please enter object's 「width」:");
        float width = scanner.nextFloat();
        System.out.println("Please enter object's 「height」:");
        float height = scanner.nextFloat();

        if (box3.validate(length, width, height)) {
            System.out.println("Box3");
        } else if (box5.validate(length, width, height)) {
            System.out.println("Box5");
        } else {
            System.out.println("No suitable box ...");
        }
    }
}
