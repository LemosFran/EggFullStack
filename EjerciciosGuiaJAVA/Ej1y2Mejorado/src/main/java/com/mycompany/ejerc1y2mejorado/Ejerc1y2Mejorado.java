/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerc1y2mejorado;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejerc1y2Mejorado {

    public static void main(String[] args) {
          Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
       int num1 = ent.nextInt();
        
        Scanner ent2 = new Scanner(System.in);
        System.out.println("Ingrese el segundo numero");
        int num2 = ent2.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("el resultado es: " + suma);
        
        Scanner entText = new Scanner(System.in);
        System.out.println("Igrese su nombre");
        String nomb = entText.nextLine();
        
        System.out.println("Su nombre es: " + nomb);
                
        
    }
}
