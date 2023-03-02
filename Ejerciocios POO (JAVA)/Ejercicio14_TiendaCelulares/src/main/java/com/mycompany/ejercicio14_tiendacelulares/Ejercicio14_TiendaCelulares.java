/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14_tiendacelulares;

import Entidad.Movil;
import Servicio.servicioMovil;

/**
 *
 * @author Usuario
 */
public class Ejercicio14_TiendaCelulares {

    public static void main(String[] args) {
        
        servicioMovil sM = new servicioMovil();
        Movil mov1 = sM.cargarCelular(); // se debe instanciar 
        //para que no me marque null
     
        // bueno listo, mejorar
        //pasar a papel las estructuras basicas
        
        System.out.println("la marca es: "+mov1.getMarca());
        
            System.out.println();
            System.out.println(mov1.toString());
            
            
            
            
        
    }
}
