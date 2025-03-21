/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt1.variables;

import java.util.Scanner;

/**
 * Classe Bàscula.
 * Calcula el pes total de totes les fruites segons el seu tipus.
 * @author Yamila Cazalla Recio
 */
public class Bàscula {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Crear Scanner
        int platan; //variable nombre enter
        int pinya; //variable nombre enter
        int taronja; //variable nombre enter
        int poma; //variable nombre enter
        System.out.println("--Fruteria--"); //Títol del programa
        System.out.print("Introdueix el número de plàtans: "); //Pregunta sobre la quantitat de plàtans
        platan = sc.nextInt(); //Introduïr la quantitat de plàtans
        System.out.print("Introdueix el número de pinyes: "); //Pregunta sobre la quantitat de pinyes
        pinya= sc.nextInt(); //Introduïr la quantitat de pinyes
        System.out.print("Introdueix el número de taronjes: "); //Pregunta sobre la quantitat de taronjes
        taronja= sc.nextInt(); //Introduïr la quantitat de taronjes
        System.out.print("Introdueix el número de pomes: "); //Pregunta sobre la quantitat de pomes
        poma= sc.nextInt(); //Introduïr la quantitat de pomes
        
        double kplatan = platan * 0.2; //Càlcul del total de kilogramas del plàtans
        double kpinya = pinya * 2; //Càlcul del total de kilogramas de les pinyes
        double ktaronja = taronja * 0.2; //Càlcul del total de kilogramas de les taronjes
        double kpoma = poma * 0.18; //Càlcul del total de kilogramas de les pomes
        System.out.println("La bosa de plàtans pesa " + kplatan + "kg."); //Text que mostra el pes total dels plàtans
        System.out.println("La bosa de pinyes pesa " + kpinya + "kg."); //Text que mostra el pes total de les pinyes
        System.out.println("La bosa de taronjes pesa " + ktaronja + "kg."); //Text que mostra el pes total de les taronjes
        System.out.println("La bosa de pomes pesa " + kpoma + "kg."); //Text que mostra el pes total de les pomes
        double totalkilos = kplatan + kpinya + ktaronja + kpoma; //Suma del total del kilograms de cada fruita
        System.out.println("El total de kilograms son " + totalkilos + "."); //Text que mostra el total de kg
    }
    
}
