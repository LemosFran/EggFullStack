/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7_nesspreso;

import java.util.Scanner;

/**
 *
 * @author franc
 */

/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:

 Constructor predeterminado o vacío

 Constructor con la capacidad máxima y la cantidad actual





Métodos getters y setters.
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero.
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/

public class Cafetera {
    private int cantMaxima = 1000;
    private int cantActual;

    //const vacio
    public Cafetera() {
    }
    // const
    public Cafetera(int cantMaxima, int cantActual) {
        this.cantMaxima = cantMaxima;
        this.cantActual = cantActual;
    }

    //getters & setters
    
    public int getCantMaxima() {
        return cantMaxima;
    }

    public void setCantMaxima(int cantMaxima) {
        this.cantMaxima = cantMaxima;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
    
    // llenar taza
    public void llenarCafetera()
    {
      cantActual = cantMaxima; 
    }
    
    //servir taza
    public void servirTaza()
    {
        Scanner infoT = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la taza");
        int taza = infoT.nextInt();
        
        if(taza > cantActual)
        {
            System.out.println("El cafe no alcanza para llenar la taza, en la taza se sirvió: " + cantActual);
        }else
        {
            cantActual -= taza;
        }
    }
    
    public int vaciarCafetera()
    {
        cantActual = 0;
        
        return cantActual;
    }
    
    public void agregarCafe()
    {
        Scanner entCaf = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de cafe a agregar a la cafetera");
        int agCafe = entCaf.nextInt();
        
        agCafe += cantActual;
        
        if(cantActual > cantMaxima)
        {
            System.out.println("Lo que se quiere agregar excede la cantidad máxima");
        }else
        {
            System.out.println("El cafe actual en la cafetera es de " + cantActual + " ml" );
        }
    }   
    
}
