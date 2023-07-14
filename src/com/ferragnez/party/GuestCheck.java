package com.ferragnez.party;

import java.util.Scanner;

public class GuestCheck {

    public static void main(String[] args) {
        //creation adn initialization of array whit guest
        String[] arraysGuest = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti" , "Ilary Blasi", "Bebe Vio", "Luis" ,"Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        //creation scanner
        Scanner input = new Scanner(System.in);
        //input
        System.out.println("Inserisci il tuo nome e cognome: ");
        String userName = input.nextLine();
        System.out.println("Il nome inserito è: " + userName);
        //check if the input is present in the guest list
        for (int i = 0; i < arraysGuest.length; i++) {

            if (userName.equals(arraysGuest[i])) {
                System.out.println(userName + " sei stato invitato! Benvenuto!");
                break;
            } else {
                System.out.println("Si allontani, non è stato invitato.");
                break;
            }
        }

    }
}
