/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quick_chat;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class QuickChat_StoreMessages {
        static String[] messageIDs = {
        "1000000001",
        "1000000002",
        "1000000003",
        "1000000004",
        "1000000005"
    };

    static String[] recipients = {
        "+27834557896",
        "+27838884567",
        "+27834484567",
        "0838884567",
        "+27838884567"
    };

    static String[] messages = {
        "Did you get the cake?",
        "Where are you? You are late! I have asked you to be on time.",
        "Yohoooo, I am at your gate.",
        "It is dinner time !",
        "Ok, I am leaving without you."
    };

    static String[] messageHashes = {
        "HA001",
        "HA002",
        "HA003",
        "HA004",
        "HA005"
    };

    static String[] status = {
        "Sent",
        "Stored",
        "Disregard",
        "Sent",
        "Stored"
    };

    static int totalMessages = 5;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int option;

        do {

            System.out.println("===== STORE MESSAGES MENU =====");
            System.out.println("1. Display Stored Messages");
            System.out.println("2. Display Longest Stored Message");
            System.out.println("3. Search Message ID");
            System.out.println("4. Search Recipient");
            System.out.println("5. Delete Message");
            System.out.println("6. Display Report");
            System.out.println("7. Exit");

         

          
    }

    public static void displayStoredMessages() {

        System.out.println("\nSTORED MESSAGES");

        for(int i = 0; i < totalMessages; i++) {

            if(status[i].equals("Stored")) {

                System.out.println("-------------------------");
                System.out.println("Sender: Developer");
                System.out.println("Recipient: " + recipients[i]);
                System.out.println("Message: " + messages[i]);
            }
        }
    }

    public static void displayLongestStoredMessage() {

        String longest = "";

        for(int i = 0; i < totalMessages; i++) {

            if(status[i].equals("Stored")) {

                if(messages[i].length() > longest.length()) {

                    longest = messages[i];
                }
            }
        }

        System.out.println("\nLongest Stored Message:");
        System.out.println(longest);
    }

    public static void searchMessageID(String id) {

        boolean found = false;

        for(int i = 0; i < totalMessages; i++) {

            if(messageIDs[i].equals(id)) {

                System.out.println("Recipient: " + recipients[i]);
                System.out.println("Message: " + messages[i]);
                found = true;
            }
        }

        if(!found) {

            System.out.println("Message ID not found.");
        }
    }

    public static void searchRecipient(String recipient) {

        boolean found = false;

        for(int i = 0; i < totalMessages; i++) {

            if(recipients[i].equals(recipient)) {

                System.out.println(messages[i]);
                found = true;
            }
        }

        if(!found) {

            System.out.println("No messages found.");
        }
    }

    public static void deleteMessage(String hash) {

        boolean found = false;

        for(int i = 0; i < totalMessages; i++) {

            if(messageHashes[i].equals(hash)) {

                for(int j = i; j < totalMessages - 1; j++) {

                    messageIDs[j] = messageIDs[j + 1];
                    recipients[j] = recipients[j + 1];
        
    
                }
            }
        }
    }
    
   public static void displayReport() {

        System.out.println("===== MESSAGE REPORT =====");

        for(int i = 0; i < totalMessages; i++) {

            System.out.println("-------------------------");
            System.out.println("Message ID: " + messageIDs[i]);
            System.out.println("Message Hash: " + messageHashes[i]);
            System.out.println("Recipient: " + recipients[i]);
            System.out.println("Message: " + messages[i]);
            System.out.println("Status: " + status[i]);
        }
    }
   
}