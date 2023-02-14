/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejdeejemplo1;

/**
 *
 * @author Usuario
 */
public class EjDeEjemplo1 {

    public static void main(String[] args) {
        Personas clases1 = new Personas("Carlitos", "Iralde","Porron" ,"Bar del Victor", 1.59, 45);
        
        System.out.println(clases1.getApellido()); // para imprimir
       
        
        clases1.setQueConsume("porron del pico"); // se cambio el 
         System.out.println(clases1.getQueConsume());
    }
}
//(String nombre, String apellido, String lugar, int altura, int edad)