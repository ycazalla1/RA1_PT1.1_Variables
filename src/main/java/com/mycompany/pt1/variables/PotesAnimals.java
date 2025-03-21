/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt1.variables;

import java.util.Scanner;

/**
 * Classe PotesAnimals.
 * Calcula la quantitat de potes dels animals.
 * @author Yamila Cazalla Recio
 */
public class PotesAnimals {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Crear Scanner
        int formiga; //variable nombre enter
        int aranya; //variable nombre enter
        int cotxinilla; //variable nombre enter
        System.out.println("--Comptador de potes--"); //Títol del programa
        System.out.print("Introdueixi cuantes formigues hi han: "); //Pregunta sobre la quantitat de formigues
        formiga= sc.nextInt(); //Introduïr la quantitat de formigues
        System.out.print("Introdueixi cuantes aranyes hi han: "); //Pregunta sobre la quantitat de aranyes
        aranya= sc.nextInt();//Introduïr la quantitat de aranyes
        System.out.print("Introdueixi cuantes cotxinilles hi han: "); //Pregunta sobre la quantitat de cotxinilles
        cotxinilla= sc.nextInt(); //Introduïr la quantitat de cotxinilles
        
        int pformiga = formiga * 6; //Càlcul del total de potes de les formigues
        int paranya = aranya * 8; //Càlcul del total de potes de les aranyes
        int pcotxinilla = cotxinilla * 14; //Càlcul del total de potes de les cotxinilles
        System.out.println("Hi ha " + pformiga + " potes de formigues."); //Text que mostra la quantitat de potes de les formigues
        System.out.println("Hi ha " + paranya + " potes de aranyes."); //Text que mostra la quantitat de potes de les aranyes
        System.out.println("Hi ha " + pcotxinilla + " potes de cotxinilles."); //Text que mostra la quantitat de potes de les cotxinilles
        int totalpotes = pformiga + paranya + pcotxinilla; //Càlcul del total de les potes de tots els invertebrats
        System.out.println("La quantitat de potes en total és la següent: " + totalpotes); //Text que mostra el resultat
    }
    
}
