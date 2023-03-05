/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejextra_2coordenadas;

import Entidad.Puntos;
import Servicios.servicioPuntos;

/**
 *
 * @author Usuario
 */
public class EjExtra_2Coordenadas {

    public static void main(String[] args) {
    
    servicioPuntos sp = new servicioPuntos();
    Puntos ppw = new Puntos();
    Puntos pp = sp.crearPuntos();
    // no crear una nueva instaciacion de Puntos
    
        System.out.println(pp.toString());
    //si se llama el to string con la instancia o objeto "ppw" sale 0
    
    sp.calcularDistancia(pp);
    }
}
