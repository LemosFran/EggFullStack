/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerecicio2_radio;

/**
 *
 * @author franc
 */
public class Ejerecicio2_radio {

    public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia();
        
        circulo.crearCircunferencia();
        circulo.area();
        circulo.perimetro();
        
        System.out.println(circulo.toString());
    }
}
