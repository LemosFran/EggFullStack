/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9_matematica;

import Entidad.Matematica;
import Servicio.servicioMatematica;

/**
 *
 * @author franc
 */
public class Ejercicio9_matematica {

    public static void main(String[] args) {
        Matematica m1 = new Matematica();
        servicioMatematica sM = new servicioMatematica();
        
       
        sM.creadorDeMundos(m1, m1);
        
        //Nueros aleatorios
        m1.setNumero1((int) (Math.random()*10));
        m1.setNumero2((int) (Math.random()*10));
        
         
        //Mostrar de prueba los nros
        System.out.println("numero 1: "+m1.getNumero1());
        System.out.println("numero 2: "+m1.getNumero2());
        
        //Metodo del servicio
        sM.mostrarMenor(m1, m1);
        
        sM.CalcularPotencia(m1, m1);
        
        sM.calcularRaiz(m1, m1);
    }
}
