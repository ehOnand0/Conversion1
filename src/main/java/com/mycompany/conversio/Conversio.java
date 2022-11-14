/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversio;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Conversio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double exchange1 = 0.88d;
        double exchange2 = 1.14d;
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("Choose a conversion, type 1 for € to £ , type 2 for £ to € ");
        
        int conv_type = sc.nextInt();
        
        if (conv_type == 1) {
            System.out.println("Type the amount of € : ");
            int eur = sc.nextInt();
            System.out.println(eur + " eur0s (€) equals : " + (eur * exchange1) + " british pounds (£)");
        } else if (conv_type == 2) {
            System.out.println("Type the amount of £ : ");
            int pou = sc.nextInt();
            
            System.out.println(pou + " british pounds (£) equals : " +  (df.format  (pou * exchange2)) + " eur0s (€)");
        }
                
        
        
    }
}