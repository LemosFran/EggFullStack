/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej6parimpar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej6ParImpar {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
         System.out.println("Ingrese un numero para comprobar si es par");
        int num = ent.nextInt();
        
        if(num % 2 == 0)
        {
            System.out.println("Es par");
        }else
        {
             System.out.println("Es impar");
        }
       
    }
}
