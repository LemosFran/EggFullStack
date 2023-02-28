/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio13_crursos;

import Entidad.Cursos;
import Servicio.servicioCursos;

/**
 *
 * @author Usuario
 */
public class Ejercicio13_Crursos {

    public static void main(String[] args) {
       
        servicioCursos sC = new servicioCursos();
         Cursos c1 = sC.crearCurso();
         
        sC.cargarAlumnos(c1);
        sC.crearCurso();
        System.out.println(c1.toString());
       
        
    }
}
