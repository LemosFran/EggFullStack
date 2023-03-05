/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioextra5_meses;

import Entidad.Meses;
import Servicios.servicioMeses;

/**
 *
 * @author franc
 El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
 */
public class EjercicioExtra5_Meses {

    public static void main(String[] args) {
        servicioMeses sm = new servicioMeses();
        Meses m = new Meses();
        
       // sm.ingresoDatos(m);
        sm.adivinar(m);
        
    }
}
