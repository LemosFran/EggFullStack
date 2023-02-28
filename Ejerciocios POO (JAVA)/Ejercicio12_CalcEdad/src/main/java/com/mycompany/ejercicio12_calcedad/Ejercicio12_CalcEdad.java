/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12_calcedad;

import com.mycompany.ejercicio12_calcedad.Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Ejercicio12_CalcEdad {

    public static void main(String[] args) {
     
       Persona per1 = new Persona();
       
       
       per1.crearPersona();
       
       
        Date traerFecha = per1.getFechaNac();
        System.out.println(traerFecha);
        per1.calcularEdad();
        per1.mayorMenor();
        System.out.println("Y su nombre es: " + per1.getNombre());
       
       
    }
}
