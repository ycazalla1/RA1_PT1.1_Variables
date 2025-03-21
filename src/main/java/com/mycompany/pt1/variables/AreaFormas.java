/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pt1.variables;

import java.util.Scanner;

/**
 *
 * @author Yamila Cazalla Recio
 */
public class AreaFormas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Crear Scanner
        double base; //variable nombre decimal
        double altura; //variable nombre decimal
        System.out.println("--Calculadora d'àrea d'un triangle--"); //Títol del programa
        System.out.print(" Introdueix la mida de la base: "); //Pregunta sobre la mida de la base
        base= sc.nextDouble(); //Introduïr la mida de la base
        System.out.print(" Introdueix la mida de l'altura: "); //Pregunta sobre la mida de l'altura
        altura= sc.nextDouble(); //Introduïr la mida de l'altura
        
        double areatriangulo = base * altura / 2; //Càlcul de l'àrea d'un triangle
        System.out.println("L'àrea del triangle es: " + areatriangulo); //Text que mostra el resultat
        
    }
}
