/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ej20cuadradomagico;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej20CuadradoMagico {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese el tamaño para la matriz");
        int n = ent.nextInt();

        int[][] mat1 = new int[n][n];
        
 // Se pueden sumar los datos uno por uno en una var. ej: mat1[0][0] + mat1[0][1]... (y asi)
        
        Scanner ingDatos = new Scanner(System.in);
        System.out.println("Ingrese los datos para la matriz");

        int SumaDiag = 0;
        int SumaI = 0;
        int SumaJ = 0;

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                mat1[i][j] = ingDatos.nextInt();
            }
            System.out.println();
        }

        // matriz original
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                System.out.print(mat1[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("diagonal: \n");
        // diagonal
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                if (i == j) {
                    System.out.print(mat1[i][j] + " ");
                    SumaDiag =  mat1[i][j] + SumaDiag;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Fila");
        //fila
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {

                if (i == 1) {
                    System.out.print(mat1[i][j] + " ");
                    SumaI =  mat1[i][j] + SumaI;
                    
                }
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Columna");
        //columna
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {

                if (j == 1) {
                    System.out.print(mat1[i][j] + " ");
                    SumaJ = mat1[i][j] + SumaJ;
                }
                System.out.println();
            }
        }
        
        if(SumaDiag == SumaI && SumaDiag == SumaJ && SumaJ == SumaI)
        {
            System.out.println("Es un cuadrado mágico");
        }else
        {
            System.out.println("No es un cuadrado mágico");
        }
        
        System.out.println();
        System.out.println("resultados");
        System.out.println("El resultado de la suma de la diagonal es: "+SumaDiag);
        System.out.println("El resultado de la suma de la fila es: "+SumaI);
        System.out.println("El resultado de la suma de la columna es: "+SumaJ);
    }
}
