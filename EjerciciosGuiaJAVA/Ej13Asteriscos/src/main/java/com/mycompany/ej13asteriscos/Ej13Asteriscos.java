/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej13asteriscos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej13Asteriscos {

    public static void main(String[] args) {
        //un if ,dentro un for para la linea inicial
        // un for para la linea del fondo
        //y dos for encadenados para la linea del medio con saltos de lineas con souts
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado");
        int nAst = entrada.nextInt();
        
        if(nAst >= 0 && nAst <= 50)
        {
            //linea arriba
            for(int i=0; i<nAst; i++)
            {
                System.out.print("*");
            }
            
            System.out.println();
            
            //linea del centro
            
            for(int i=0; i < nAst; i++) //ver bien como funciona ese -2
            {
               System.out.print("*");
                for(int j=0; j < nAst; j++)
                {
                    System.out.print(" ");
                    
                }
                System.out.println("*");
            }
            
            //linea de abajo
            
            for(int i=0; i<nAst; i++)
            {
                System.out.print("*");
            }
            
        }
    }
}
