/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerecicio2_radio;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
  public void crearCircunferencia()
  {
      Scanner entCirc = new Scanner(System.in);
      System.out.println("Ingrese el radio del circulo");
      radio += entCirc.nextDouble();
  }
  
  public void area()
  {
      double area1 = 3.14 * (radio*radio);
      System.out.println("El area es: " + area1);
  }
  
  public void perimetro()
  {
      double perim = 2 * 3.14 * radio;
      System.out.println("El perimetro es: " + perim);
  }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
  
  
  
}
