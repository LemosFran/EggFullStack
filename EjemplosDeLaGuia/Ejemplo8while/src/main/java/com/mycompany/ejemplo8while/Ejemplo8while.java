/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo8while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejemplo8while {

    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        System.out.println("Ing la nota ");
        int notas = nota.nextInt();
       
        
        while(notas < 1 || notas >= 10)
        {
            System.out.println("Siga ingresando notas");
            
           
            notas = nota.nextInt();
            
            
            
        } System.out.println("Perfecto");
        
        
    }
    
}
