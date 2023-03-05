/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioRaices {
    public double getDiscriminante(Raices r) {
        return Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
    }
//SON TODOS METODOS VOID    
    public boolean tieneRaices(Raices r) {
        double disc = getDiscriminante(r);
        return disc >= 0;
    }

    public boolean tieneRaiz(Raices r) {
        double disc = getDiscriminante(r);
        return disc == 0;
    }

    public void obtenerRaices(Raices r) {
        if (tieneRaices(r)) { // debe ser por que ya tiene mas de una dato ya
            double disc = getDiscriminante(r);
            double x1 = (-r.getB() + Math.sqrt(disc)) / (2 * r.getA());
            double x2 = (-r.getB() - Math.sqrt(disc)) / (2 * r.getA());
            System.out.println("Las raíces son: " + x1 + " y " + x2);
        } else {
            System.out.println("No tiene raíces reales.");
        }
    }

    public void obtenerRaiz(Raices r) {
        if (tieneRaiz(r)) {
            double x = -r.getB() / (2 * r.getA());
            System.out.println("La única raíz es: " + x);
        } else {
            System.out.println("No tiene raíz real única.");
        }
    }

    public void calcular(Raices r) { // aca usa los demas metodos por eso lo que esta dentro del if
        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else {
            System.out.println("No tiene solución real.");
        }
    }
}