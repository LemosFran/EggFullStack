/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej5raizcuadrada;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej5RaizCuadrada {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Ingrese su numero");
       Double num = entrada.nextDouble();
       
       Double elDoble, elTriple, raizCuadrada;
       elDoble = num * 2;
       elTriple = num *3;
       raizCuadrada = Math.sqrt(num); // A diferecia de .toLowerCase lo que se quiere transformar se escribe dentro
       
        System.out.println("El doble es: " + elDoble + "\n" + "El triple es: " + elTriple + "\n" + "Y la raiz cuadrada es: " + raizCuadrada);
    }
}
