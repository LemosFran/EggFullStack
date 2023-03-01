/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioMovil {
    //Character.getNumericValue(digitos.charAt(i)
    //codigo[i] = Character.getNumericValue(num.charAt(i));
   
    
    Scanner scan = new Scanner(System.in);
    
    public Movil cargarCelular()
    { 
        Movil m1 = new Movil();
        System.out.println("Ingrese la marca del celular"); 
        m1.setMarca(scan.nextLine());
        
        
        
        return m1;
    }
}
