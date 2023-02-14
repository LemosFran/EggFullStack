/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej10primerbucle;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej10PrimerBucle {

    public static void main(String[] args) {
        // Valor limite
        Scanner ent1 = new Scanner(System.in);
        System.out.println("Escribe un valor limite");
        int limitador = ent1.nextInt();
        
        
        // silicitud de números
       int suma = 0;
        for(int i=0; i<limitador; i++)
        {
            Scanner ent2 = new Scanner(System.in);
            System.out.println("Escribe un numero");
            int lectFor = ent2.nextInt();
            suma += lectFor;  
            if(suma == limitador)
        {
            break;
        }
        }
       
    }
}
