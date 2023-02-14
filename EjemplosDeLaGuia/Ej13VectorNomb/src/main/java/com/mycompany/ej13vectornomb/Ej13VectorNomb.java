/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej13vectornomb;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej13VectorNomb {

    public static void main(String[] args) {
      
        // crear vector con la cant de compañeros
        Scanner comp = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de compañeros");
        int cantComp = comp.nextInt();
        
        String [] Equipo = new String [cantComp];
        
        Equipo[0] = "Joaco";
        Equipo[1] = "Ricardo";
        Equipo[2] = "Fede";
        Equipo[3] = "Brian";
        Equipo[4] = "Juan";
        Equipo[5] = "Franco";
        Equipo[6] = "Franco Yo";
       
        System.out.println(Equipo[5]);
        System.out.println();
        
       /* for(int i=0; i<Equipo.length; i++)
        {
            System.out.println(Equipo[i]);}*/
        
        // FOR ENHANED VER COMO FUNCIONA
       for (String Equipo1 : Equipo) {  // funciona igaul
            System.out.println(Equipo1);}
       
  //-------------------------------------------------------------
  
       /* Scanner ingNomb = new Scanner(System.in);
        String nombres = "";
        
        
        for(int i=1; i<Equipo.length + 1; i++)
        {
               System.out.println("ingrese el nombre del compañero " + i);
           
           String nombEq = ingNomb.next(); // el lector dentro para que repita "ingresar datos"
            nombEq += nombres; // mandamos el valor a la var de afuera
            System.out.println(nombres);
        }*/
       
        
        
    }
}
