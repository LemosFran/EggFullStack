/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10_arrays;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Usuario
 */
public class Ejercicio10_Arrays {

    public static void main(String[] args) {
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        Random rnd = new Random(); //muy util para reutilizarlo "datos random"

        // Llenar el arreglo A con valores aleatorios
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = rnd.nextDouble() * 100;
        }

        // Mostrar el arreglo A sin ordenar
        System.out.println("Arreglo A sin ordenar:");
        System.out.println(Arrays.toString(arregloA));

        // Ordenar el arreglo A de menor a mayor
        Arrays.sort(arregloA);

        // Copiar los primeros 10 elementos del arreglo A al arreglo B
        System.arraycopy(arregloA, 0, arregloB, 0, 10);

        // Rellenar los últimos 10 elementos del arreglo B con el valor 0.5
        Arrays.fill(arregloB, 10, 20, 0.5);

        // Mostrar el arreglo A ordenado
        System.out.println("Arreglo A ordenado:");
        System.out.println(Arrays.toString(arregloA));

        // Mostrar el arreglo B combinado
        System.out.println("Arreglo B combinado:");
        System.out.println(Arrays.toString(arregloB));
    }
    
}
