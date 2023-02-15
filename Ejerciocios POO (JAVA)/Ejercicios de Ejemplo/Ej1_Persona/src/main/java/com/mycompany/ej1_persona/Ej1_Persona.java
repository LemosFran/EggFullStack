/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej1_persona;

import Entidad.Persona;

/**
 *
 * @author Usuario
 */



public class Ej1_Persona {
    

    public static void main(String[] args) {
        Persona persona1 = new Persona("Franco", "Lemos", 37300758);
        
        System.out.println(persona1.getNombre());
        
        persona1.setApellido("Powell");
        
        System.out.println(persona1.getApellido());
    }
}//String nombre, String apellido, double dni
