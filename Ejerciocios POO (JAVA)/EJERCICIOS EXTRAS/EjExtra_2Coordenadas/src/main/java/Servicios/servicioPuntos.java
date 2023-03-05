/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioPuntos {
    Scanner scan = new Scanner(System.in);
   
   
    public Puntos crearPuntos()
    {
        
        Puntos p1 = new Puntos();
        System.out.println("Ingrese el valor de x1");
        int val1 = scan.nextInt();
        p1.setX1(val1);
        
        System.out.println("Ingrese el valor de x2");
        p1.setX2(scan.nextInt());
        
        System.out.println("Ingrese el valor de y1");
        p1.setY1(scan.nextInt());
        
        
        System.out.println("Ingrese el valor de y2");
        p1.setY2(scan.nextInt());
        
        return p1;
        
    }
    
    public void calcularDistancia(Puntos pj)
    {//se agrega el parametro para que ingrese los datos y los acomode
        //automaticamente, desde esto se puede traer con el get
        double probInt1 = Math.pow((pj.getX2() - pj.getX1()), 2) + Math.pow((pj.getY2() - pj.getY1()), 2);
        double total = Math.sqrt(probInt1);
        
        System.out.println("La distancia entre los puntos es: " + total);
    }
    
}
