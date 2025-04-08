/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt1.variables;

import java.util.Scanner;

/**
 * Classe IVA.
 * Calcula l'increment de l'IVA.
 * @author Yamila Cazalla Recio
 */
public class IVA {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Crear Scanner
        double preu; //Variable de l'import decimal
        double iva; //Variable del IVA nombre decimal
        System.out.println("--Calculadora d'IVA--");//Títol del programa
        System.out.print("Introdueix l'import: "); //Pregunta sobre l'import
        preu= sc.nextDouble(); //Per a introduïr el número
        System.out.print("Introdueix el IVA desitjat: "); //Pregunta sobre el IVA
        iva= sc.nextInt(); //Per a introduïr el valor del IVA
        
        double IVA = preu * iva / 100; //Càlcul del IVA
        double resultat = preu + IVA; //Sumar el IVA al preu
        System.out.println("Import del IVA = " + IVA); //Imprimir l'import del IVA
        //Imprimir el càlcul
        System.out.println("Resultat del càlcul de l'import + IVA = " + resultat);
    }
    
}
