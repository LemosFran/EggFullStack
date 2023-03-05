/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioextra4_nif;
import Entidad.NIF;
import Servicio.servicioNIF;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class EjercicioExtra4_NIF {

    public static void main(String[] args) {
        NIF en1 = new NIF();
        servicioNIF sn = new servicioNIF();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su DNI!");
        en1.setDni(scan.nextInt());
        
        sn.crearNIF(en1);
       //creo que me admite boolean nomas para pasar func como parametros
      sn.mostrar(en1);
       
        
    }
}
