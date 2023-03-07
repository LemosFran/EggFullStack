/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio12_calcedad.Entidad;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Persona {

    private String nombre;
    private Date fechaNac; // no hace falta poner el tipo date
    //con un int desde un date se puede hacer el set
    private int edad;
    
    public Persona() {
    }

    public Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodos HACER BIEN Y PASAR AL CUADERNO DE COMO SETEAR UN ATRIB MAIN
    public void crearPersona() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nomb = scan.nextLine();

        System.out.println("Digite su dia de nacimiento");
        int dia = scan.nextInt();

        System.out.println("Digite su mes de nacimiento");
        int mes = scan.nextInt();

        System.out.println("Digite su año de nacimiento");
        int anio = scan.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);

        nombre = nomb;
        fechaNac = fecha;
    }
    
    public void calcularEdad()
    {
        Date fechaActual = new Date();
        
        long claculoFecha = fechaActual.getYear() - fechaNac.getYear() -1;
        //long calcms = claculoFecha / 1000 / 60 / 60 / 24 / 365;
       
        System.out.println(claculoFecha); 
        
    }
    
    public void mayorMenor()
    {
        Date fechaActual = new Date();
        
        long claculoFecha1 = fechaActual.getYear() - fechaNac.getYear() -1;
        
        if(claculoFecha1 < 18)
        {
            System.out.println("Menor de edad");
        }else 
        {
            System.out.println("Mayor de edad");
        }
    }
    
}
