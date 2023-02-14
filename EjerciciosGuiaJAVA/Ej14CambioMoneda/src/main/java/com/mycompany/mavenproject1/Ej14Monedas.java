/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej14Monedas {

    public static void cambioMoneda(double monto, String divisa)
    {
        System.out.println("$"+monto + " " + divisa);
         // si la moneda es tal y tal
         //abrir un menu de opciones
         //crear variables con las conversiones
         //inscripcion al final de la eleccion
         //aplicar el equalsIgnore
    }
    
    public static void main(String[] args) {
 /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/
        Scanner entMoneda = new Scanner(System.in);
        System.out.println("Ingrese la moneda ");
        String tipoMoneda = entMoneda.nextLine();
        
        Scanner entCant = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a cambiar");
        double aCambiar = entCant.nextDouble();
        
       cambioMoneda(aCambiar, tipoMoneda);
        
    } 
}
