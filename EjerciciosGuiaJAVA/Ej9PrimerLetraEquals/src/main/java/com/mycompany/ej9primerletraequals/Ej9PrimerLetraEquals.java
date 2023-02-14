/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej9primerletraequals;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej9PrimerLetraEquals {

    public static void main(String[] args) {
       Scanner ent1 = new Scanner(System.in);
       System.out.println("Ingrese la primer palabra");
       String frase1 = ent1.nextLine();
       
        Scanner ent2 = new Scanner(System.in);
       System.out.println("Ingrese una palabra");
       String frase2 = ent2.nextLine();
       
       if(frase1.startsWith("a") && frase2.startsWith("a"))
       {
           System.out.println("CORRECTO");
       }else{
           System.out.println("FALSO");
       }
    }
}
