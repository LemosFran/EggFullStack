/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej18matrizinver;

import java.util.Scanner;

/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).*/
/**
 *
 * @author Usuario
 */
public class Ej18matrizInver {

    public static void main(String[] args) {
        int [][] matr1 = new int[4][4];
        
       System.out.println("Ingrese numero para la matriz");
        Scanner ent = new Scanner(System.in);
                
       for(int i=0; i<matr1.length; i++)
       {
           System.out.println();//espacios entre ing de datos
           for(int j=0; j<matr1.length; j++)
           {
               matr1[i][j]=ent.nextInt();
           }
       }
        System.out.println();//esp entre datos y las matrices
        
        System.out.println("Matriz original");
        for(int i=0; i<matr1.length; i++)
       {
           for(int j=0; j<matr1.length; j++)
           {
               
               System.out.print(matr1[i][j] + " ");
           }
          System.out.println(); //mantiene la matriz aramada
       }
        
        System.out.println(); //esp entre las dos matrices
        System.out.println("Matriz invertida");
       for(int i=0; i<matr1.length; i++)
       {
           for(int j=0; j<matr1.length; j++)
           {
              
               System.out.print(matr1[j][i] + " ");
               
           }
           System.out.println();
       
        
       }
       
        
       
    }   
    
}
