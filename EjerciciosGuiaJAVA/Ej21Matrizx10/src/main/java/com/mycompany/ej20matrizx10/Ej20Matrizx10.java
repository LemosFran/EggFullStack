/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ej20matrizx10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej20Matrizx10 {

    public static void main(String[] args) {
        int[][] matrizX10 = new int[10][10];

        for (int i = 0; i < matrizX10.length; i++) {
            for (int j = 0; j < matrizX10.length; j++) {
                matrizX10[i][j] = (int) (Math.random() * 100);
            }
        }

        //escribimos la matriz
        for (int i = 0; i < matrizX10.length; i++) {
            for (int j = 0; j < matrizX10.length; j++) {
                System.out.print(matrizX10[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // la matriz 3x3 con datos del usuario
        int[][] matrizX3 = new int[3][3];
        Scanner entDatos = new Scanner(System.in);
        System.out.println("Ingrese los datos para la matriz");

        for (int i = 0; i < matrizX3.length; i++) {
            for (int j = 0; j < matrizX3.length; j++) {
                matrizX3[i][j] = entDatos.nextInt();
            }
        }

        // imprime la matriz 3*3
        for (int i = 0; i < matrizX3.length; i++) {
            for (int j = 0; j < matrizX3.length; j++) {
                System.out.print(matrizX3[i][j] + " ");
            }
            System.out.println();
        }

        // buscador
        int contador = 0; // cantidad de numeros repetidos bien
        //VER COMO LOCALIZAR LA PROSICION

        int posicion = 0;

        //int [][] matrizIguales = new int[][];
        for (int i = 0; i < matrizX3.length; i++) {
            for (int j = 0; j < matrizX3.length; j++) {
                if (matrizX3[i][j] == matrizX10[i][j]) {
                    System.out.println("la poisicion es " + "[" + i + "]" + "[" + j + "]");
                   
                }

            }

        }

        System.out.println("Los numero repetidos: " + contador + "\n" + posicion);
    }
}
