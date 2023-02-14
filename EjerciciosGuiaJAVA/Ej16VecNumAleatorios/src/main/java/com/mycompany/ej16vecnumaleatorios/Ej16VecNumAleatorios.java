/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej16vecnumaleatorios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej16VecNumAleatorios {

    public static void main(String[] args) {
/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/
       
        double [] colecNum = new double[10];
        
        for(int i=0; i<colecNum.length; i++)
        {
            colecNum[i]= Math.round(Math.random()*10);
        }

        for(int i=0; i<colecNum.length; i++)
        {
            System.out.println(colecNum[i]);
        }
        
       Scanner entNum = new Scanner(System.in);
        System.out.println("Ingrese el numero a buscar");
        int buscarNum = entNum.nextInt();
        int contador = 0;
        int posicion = 0; 
        
        
        //for de busqueda
        for(int i=0; i<colecNum.length; i++)
        {
            if(colecNum[i] == buscarNum){
            contador++;
            posicion=i;
           
            }
          
            
        }
        if(contador != 1)
                { 
                    
                    System.out.println("Esta repetido "+ contador +" veces" + " y esta en la posicion: "+ posicion);
                }else
        {
            System.out.println("el nro no esta repetido y esta en la posicion: "+ posicion);
        }
    
    }
}
