package com.pluralsight;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        int serialNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("What model is your phone? ");
        String model = scanner.nextLine();
        System.out.print("Who is your carrier? ");
        String carrier = scanner.nextLine();
        System.out.print("What is your phone number? ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        CellPhone cellPhone1 = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);
        CellPhone cellPhone2 = new CellPhone(5319205, "iPhone 15 Plus", "t-mobile", "1234567890", "John Doe");
        cellPhone1.dial(cellPhone2);
        cellPhone2.dial(cellPhone1);
        phoneInfo(cellPhone1);
        phoneInfo(cellPhone2);
    }
    public static void phoneInfo(CellPhone phone) {
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber() + "\n\n");
    }
}
