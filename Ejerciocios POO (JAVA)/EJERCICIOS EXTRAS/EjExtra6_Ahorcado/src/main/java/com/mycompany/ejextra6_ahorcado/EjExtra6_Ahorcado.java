/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejextra6_ahorcado;

import Entidad.Ahorcado;
import Servicio.servicioAhorcado;

/**
 *
 * @author Usuario
 */
public class EjExtra6_Ahorcado {

    public static void main(String[] args) {
        servicioAhorcado sa = new servicioAhorcado();
        Ahorcado ah = new Ahorcado();
        
        sa.crearJuego(ah);
        System.out.println(ah.toString());
        
        //puedo imprimirlo directamente llamando a la func
        //es totalmente al  pedo, hacerlo mas simple

    }
}
