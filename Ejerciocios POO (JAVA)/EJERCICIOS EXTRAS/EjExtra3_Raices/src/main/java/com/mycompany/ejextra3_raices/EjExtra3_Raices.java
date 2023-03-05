/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejextra3_raices;

import Entidad.Raices;
import Servicio.servicioRaices;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjExtra3_Raices {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); // se instancia raices entidad

    //se asignan los valores (diractamente desde el main)
    System.out.println("Ingrese el valor de A:");
    double a = scan.nextDouble();

    System.out.println("Ingrese el valor de B:");
    double b = scan.nextDouble();

    System.out.println("Ingrese el valor de C:");
    double c = scan.nextDouble();

    Raices r = new Raices(a, b, c); // se setean por parametros

    servicioRaices sr = new servicioRaices(); //estas estan todas entrelazadas
//    sr.getDiscriminante(r);
//    sr.tieneRaices(r);
//    sr.tieneRaiz(r);
//    sr.obtenerRaices(r);
//    sr.obtenerRaiz(r);
    sr.calcular(r);
    
}
}
