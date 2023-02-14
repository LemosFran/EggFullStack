/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dowhile;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int notas = entrada.nextInt();
        
        do
        {
            System.out.println("hola");
            
            break;
        }while(notas < 10 && notas >1);
        
    }
}
