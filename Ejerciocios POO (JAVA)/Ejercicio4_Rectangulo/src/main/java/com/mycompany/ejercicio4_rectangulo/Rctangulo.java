/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4_rectangulo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */

//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
//base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
//con los datos del Rectángulo dados por el usuario. También incluirá un método para
//calcular la superficie del rectángulo y un método para calcular el perímetro del
//rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
//asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
//setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.

public class Rctangulo {
    
    private int base; // atributos
    private int altura;
    
    public void crearrectangulo()
    {
        Scanner entRect = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        base += entRect.nextInt();
        
        System.out.println("Ingrese la altura del rectangulo");
        altura += entRect.nextInt();
        
    }
    
    /**
     * constructor vacio
     */
    public Rctangulo() {
    }
    
    /**
     * constructor con parametros
     * @param base
     * @param altura
     */
        public Rctangulo(int base, int altura)
        {
            this.base = base;
        this.altura = altura;
        }

    /**
     * Getters & Setters
     * @return 
     */
        
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

  
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * método calculador de superficie y perímetro
     */
    public void superficie() {
        System.out.println("Este es la superficie: " + (base*altura));
    }
        
        public void perimetro()
        {
            System.out.println("Este es la superficie: " + (base +altura)*2);
        }
    
    /**
     *Método para dibujar el rectangulo 
     */
        
        public void dibujarRectangulo()
        {
            for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
        
        
}
