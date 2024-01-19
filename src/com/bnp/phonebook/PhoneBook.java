package com.bnp.phonebook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    // ANSI escape codes for text color
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    private static final Scanner scanner = new Scanner(System.in);
//    private static ArrayList<String> contactNames = new ArrayList<String>();
//    private static ArrayList<String> contactNumbers = new ArrayList<String>();
    static ArrayList<Contact> contacts = new ArrayList<>();
    public static void main(String[] args) {
        int userInput;
        do {
            printMenu();
            userInput = scanner.nextInt();
            scanner.nextLine();
            switch (userInput) {
                case 1:
                    addContact();
                    break;
                case 2:
                    printContactList();
                    break;
                case 3:
                    System.out.println(ANSI_BLUE + "See you later!" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "\nPlease enter a correct answer!\n" + ANSI_RESET);
            }
        } while (userInput != 3);
        scanner.close();
    }

    private static void printMenu() {
        System.out.println(ANSI_GREEN + "********** Menu **********" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "1: Add Contact to the phonebook" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "2: Print the phonebook" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "3: Exit from the program\n" + ANSI_RESET);
        System.out.print(ANSI_CYAN + "Please enter your request: " + ANSI_RESET);
    }
    private static void addContact() {
        Contact newContact = new Contact();
        System.out.print(ANSI_CYAN + "\nEnter your contact's name: " + ANSI_RESET);
//        String name = scanner.nextLine();
//        newContact.name = scanner.nextLine();
        newContact.setName(scanner.nextLine());
//        System.out.println("Your contact's name is: " + name + "\n");
//        System.out.println("Your contact's name is: " + newContact.name + "\n");
        System.out.println("Your contact's name is: " + newContact.getName()+ "\n");
        System.out.print(ANSI_CYAN + "Enter your contact's number: " + ANSI_RESET);
//        String number = scanner.nextLine();
//        newContact.number = scanner.nextLine();
        newContact.setNumber(scanner.nextLine());
//        System.out.println("Your contact's number is: " + number + "\n");
//        System.out.println("Your contact's number is: " + newContact.number + "\n");
        System.out.println("Your contact's number is: " + newContact.getNumber() + "\n");
        contacts.add(newContact);
//        contactNames.add(name);
//        contactNumbers.add(number);
        System.out.println("Your contact's info is added successfully!\n");
    }
    private static void printContactList() {
//        if (contactNames.isEmpty())
        if (!contacts.isEmpty()) {
            System.out.println("******* Phonebook list *******");
//        for (int i = 0; i < contactNames.size(); i++)
//            System.out.println("Name: " + contactNames.get(i) + "    Phone number: " + contactNumbers.get(i));
//        for (int i = 0; i < contacts.size(); i++)
//            System.out.println("Name: " + contacts.get(i).name + "    Phone number: " + contacts.get(i).number);
            for (Contact contact : contacts)
//                System.out.println("Name: " + contact.name + "    Phone number: " + contact.number);
                System.out.println("Name: " + contact.getName() + "    Phone number: " + contact.getNumber());
        } else {
            System.out.println("There is not yet any contact in your phonebook!");
        }
    }
}
