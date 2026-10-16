package com.pluralsight;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        saydisplayMenu();
        sayChoices();

    }
    public static void saydisplayMenu() {
        System.out.println("====MENU====");
    }
    public static void sayChoices() {
        System.out.println("1. Coffee - $3.99 ");
        System.out.println("2. Tea - $2.99 ");
        System.out.println("3. Cookie - $1.99 ");
    }
}
