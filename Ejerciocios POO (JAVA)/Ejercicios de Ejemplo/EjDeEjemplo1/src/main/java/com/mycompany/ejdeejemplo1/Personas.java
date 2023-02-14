/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejdeejemplo1;

/**
 *
 * @author Usuario
 */
public class Personas {
    String nombre;
    String apellido;
    String queConsume;
    String lugar;
    double altura;
    int edad;

    public Personas() {
    }

    public Personas(String nombre, String apellido, String queConsume, String lugar, double altura, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.queConsume = queConsume;
        this.lugar = lugar;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getQueConsume() {
        return queConsume;
    }

    public void setQueConsume(String queConsume) {
        this.queConsume = queConsume;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
