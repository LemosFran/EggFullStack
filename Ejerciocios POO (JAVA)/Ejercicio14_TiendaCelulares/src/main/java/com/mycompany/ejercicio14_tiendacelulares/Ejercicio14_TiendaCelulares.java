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
        
        sM.cargarCelular();
        System.out.println("la marca es: "+mov1.getMarca());
    }
}
