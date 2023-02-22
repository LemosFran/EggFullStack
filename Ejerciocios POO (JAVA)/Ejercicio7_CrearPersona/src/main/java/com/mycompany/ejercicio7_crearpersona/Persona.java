/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7_crearpersona;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Persona {

    private String H;
    private String M;
    private String O;

    public Persona() {
    }

    public Persona(String H, String M, String O) {
        this.H = H;
        this.M = M;
        this.O = O;
    }

    public String getH() {
        return H;
    }

    public void setH(String H) {
        this.H = H;
    }

    public String getM() {
        return M;
    }

    public void setM(String M) {
        this.M = M;
    }

    public String getO() {
        return O;
    }

    public void setO(String O) {
        this.O = O;
    }

    public void crearPersona() {
        //ifs o switch para que elija alguna opc
        Scanner ingSex = new Scanner(System.in);
        System.out.println("Ingrese su sexo: \n H. Hombre \n M. Mujer \n O. Otro");
        String sex = ingSex.nextLine(); // ver donde poner el ignore case

        switch (sex) {
            case "H": {
                H = "Hombre";
                break;
            }

            case "M": {
                M = "Mujer";
                break;
            }

            case "O":
              {
                O = "Otros";
                break;
            }
              
              default: 
              {
                  System.out.println("Opción incorrecta");
              }
        }

    }
    /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.*/
    public void calcularIMC()
    {
        Scanner ingDat = new Scanner(System.in);
        System.out.println("Ingrese su peso");
        double peso = ingDat.nextDouble();
        System.out.println("Inrese su altura");
        double altura = ingDat.nextDouble();
        
        double calculo = peso / (altura * altura);
        
        if(calculo < 20)
        {
            System.out.println("-1");
        }else if(calculo >= 20 && calculo <= 25)
        {
            System.out.println("0");
        }else
                {
                 System.out.println("1");  
                }
        
    }
    
    /*Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.*/
    
    public void esMayorDeEdad()
    {
        Scanner entEd = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = entEd.nextInt();
        boolean edad2;
        
        if(edad >= 18)
        {
            edad2 = true;
            System.out.println(edad2);
        }else
        {
            edad2 = false;
            System.out.println(edad2);
        }
    }
    
    
    
}
