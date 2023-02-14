/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej19matrizasimetrica;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej19MatrizAsimetrica {

  /*public static boolean isAntiSymmetric(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    
    // Comprobamos si la matriz es cuadrada
    if (rows != cols) {
        return false;
    }
    
    // Recorremos la matriz y comparamos cada elemento con su traspuesto negado
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] != -matrix[j][i]) {
                return false;
            }
        }
    }
    
    return true;
}
    */
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
       
       // comprobacion
       int rows = matr1.length;
       int cols = matr1[0].length;
       
       // Comprobamos si la matriz es cuadrada
    if (rows == cols) {
        System.out.println("Es cuadrada");
    }
       // Recorremos la matriz y comparamos cada elemento con su traspuesto negado
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (matr1[i][j] != -matr1[j][i]) {
                System.out.println("no es anti simetrica");
            }
        }
    }
    
        System.out.println("Es anti simetrica");
}






        
      
    
}
