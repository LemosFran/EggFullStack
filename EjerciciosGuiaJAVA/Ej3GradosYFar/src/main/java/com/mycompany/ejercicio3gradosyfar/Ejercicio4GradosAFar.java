/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3gradosyfar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4GradosAFar {

    public static void main(String[] args) {
        Scanner ent1 = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados");
        Double grados = ent1.nextDouble();
        
        double conversion = grados + (9 * grados / 5);
        System.out.println("La tempretura em grados es: " + grados + "°C y en Farenheit es de: " + conversion + "°F");
    }
}
