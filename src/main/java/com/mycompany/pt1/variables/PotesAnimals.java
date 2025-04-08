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
        // finals per indicar el nombre de cada animal
        final int FORMIGA_POTES = 6, ARANYA_POTES = 8, COTXINILLA_POTES = 14;
        System.out.println("--Comptador de potes--"); //Títol del programa
        //Pregunta sobre la quantitat de formigues
        System.out.print("Introdueixi cuantes formigues hi han: ");
        formiga= sc.nextInt(); //Introduïr la quantitat de formigues
        //Pregunta sobre la quantitat de aranyes
        System.out.print("Introdueixi cuantes aranyes hi han: ");
        aranya= sc.nextInt();//Introduïr la quantitat de aranyes
        //Pregunta sobre la quantitat de cotxinilles
        System.out.print("Introdueixi cuantes cotxinilles hi han: ");
        cotxinilla= sc.nextInt(); //Introduïr la quantitat de cotxinilles
        
        //Càlcul del total de potes de les formigues
        int pformiga = formiga * FORMIGA_POTES;
        //Càlcul del total de potes de les aranyes
        int paranya = aranya * ARANYA_POTES;
        //Càlcul del total de potes de les cotxinilles
        int pcotxinilla = cotxinilla * COTXINILLA_POTES;
        //Text que mostra la quantitat de potes de les formigues
        System.out.println("Hi ha " + pformiga + " potes de formigues.");
        //Text que mostra la quantitat de potes de les aranyes
        System.out.println("Hi ha " + paranya + " potes de aranyes.");
        //Text que mostra la quantitat de potes de les cotxinilles
        System.out.println("Hi ha " + pcotxinilla + " potes de cotxinilles.");
        //Càlcul del total de les potes de tots els invertebrats
        int totalpotes = pformiga + paranya + pcotxinilla;
        //Text que mostra el resultat
        System.out.println("La quantitat de potes en total és la següent: "
                + totalpotes);
    }
    
}
