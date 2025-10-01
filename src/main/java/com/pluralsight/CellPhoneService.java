package com.pluralsight;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone cellPhone1 = new CellPhone();
        System.out.print("What is the serial number? ");
        cellPhone1.setSerialNumber(scanner.nextInt());
        System.out.print("What model is your phone? ");
        cellPhone1.setModel(scanner.next());
        System.out.println("Who is your carrier? ");
        cellPhone1.setCarrier(scanner.next());
        System.out.println("What is your phone number? ");
        cellPhone1.setPhoneNumber(scanner.next());
        System.out.println("Who is the owner of the phone? ");
        cellPhone1.setOwner(scanner.next());

        System.out.println("Hello");
        System.out.println(cellPhone1.getSerialNumber() + "\n" + cellPhone1.getModel() + "\n" + cellPhone1.getCarrier() + "\n" + cellPhone1.getPhoneNumber() + "\n" + cellPhone1.getOwner());
    }
}
