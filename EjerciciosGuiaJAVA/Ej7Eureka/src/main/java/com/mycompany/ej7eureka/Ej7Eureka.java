/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej7eureka;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej7Eureka {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
         System.out.println("Ingrese una palabra");
        String frase = ent.nextLine();
        
        if(frase.equals("eureka"))
        {
            System.out.println("CORRECTO");
        }else{
            System.out.println("FALSO");
        }
       
    }
}
