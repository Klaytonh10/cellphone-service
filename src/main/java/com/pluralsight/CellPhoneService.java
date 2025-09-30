package com.pluralsight;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the serial number: ");
        int serialNumber = scanner.nextInt();
        System.out.print("What is the model: ");
        String model = scanner.nextLine();
        System.out.print("What is the carrier: ");
        String carrier = scanner.nextLine();
        System.out.print("What is the phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Who is the owner : ");
        String owner = scanner.nextLine();

        CellPhone phone1 = new CellPhone.PhoneValues(serialNumber, model, carrier, phoneNumber, owner);
    }
}
