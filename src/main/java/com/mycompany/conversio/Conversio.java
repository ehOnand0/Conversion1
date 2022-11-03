/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversio;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Conversio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix en €");
        int valor_lliures = sc.nextInt();
                
        double tipus_de_canvi = 0.87d;
        System.out.println(valor_lliures + " Lliures (£) 5 equivalen a: " + (valor_lliures * tipus_de_canvi) + " eur0s (€)");
    }
}