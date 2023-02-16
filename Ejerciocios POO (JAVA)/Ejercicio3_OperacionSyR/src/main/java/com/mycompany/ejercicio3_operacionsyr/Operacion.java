/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3_operacionsyr;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Operacion {
    private int numero1;
    private int numero2;

    
    // const vacio
    public Operacion() {
    }
    
    
    // const con parametros
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion()
    {
        Scanner entNum = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero1 += entNum.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        numero2 += entNum.nextInt();
    }
    
//Metodos suma,resta,div,mult. usar if si la div es 0 dar error
    
    public void suma()
    {
        System.out.println("El resultado de la suma es: " + (numero1+numero2));
    }
    
    public void resta()
    {
        System.out.println("El resultado de la resta es: " + (numero1-numero2));
    }
    
    public void mult()
    {
        System.out.println("El resultado de la suma es: " + (numero1*numero2));
    }
    
    public void div()
    {
        if(numero1 == 0 || numero2 == 0)
        {
            System.out.println("Error e la division");
            
        }else
        {
            System.out.println("El resultado de la division es: " + (numero1 / numero2));
        } // otro cambio
        //System.out.println("El resultado de la suma es: " + (num1+num2));
    }
}
