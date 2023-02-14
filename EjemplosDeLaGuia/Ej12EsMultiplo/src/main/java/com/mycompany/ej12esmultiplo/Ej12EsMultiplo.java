/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej12esmultiplo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej12EsMultiplo {

    //TERMINAR EJERCICIO
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese un nro");
        int num1 = ent.nextInt();
        
        Scanner ent2 = new Scanner(System.in);
        System.out.println("Ingrese otro nro");
        int num2 = ent.nextInt();
        
        if(num1 % num2 == 0)
        {
            System.out.println("Es multiplo");
            
        }else
            {
        System.out.println("No es multiplo");
            }
    }
}
