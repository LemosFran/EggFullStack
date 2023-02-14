/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer3maymin;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejer3MayMin {

    public static void main(String[] args) {
        Scanner frase = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String fraseMin = frase.nextLine().toLowerCase();
       
       System.out.println(fraseMin);
        
       System.out.println();
        
        Scanner frase2 = new Scanner(System.in);
        System.out.println("Ingrese otra palabra");
        String fraseMay = frase.nextLine().toUpperCase();
        // el next(); solo te toma solo la primer palabra
        System.out.println(fraseMay);
    }
}
