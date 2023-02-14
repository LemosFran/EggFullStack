/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej8_8palabras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej8_8palabras {

    public static void main(String[] args) {
       Scanner ent = new Scanner(System.in);
       System.out.println("Ingrese una palabra");
       String frase = ent.nextLine();
       
       if(frase.length() == 8)
       {
           System.out.println("CORRECTO");
       }else{
           System.out.println("FALSO");
                   
       }
        
    }
}
