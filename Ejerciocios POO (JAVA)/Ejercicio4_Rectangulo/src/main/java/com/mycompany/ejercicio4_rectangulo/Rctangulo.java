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
        
        
    }
}
