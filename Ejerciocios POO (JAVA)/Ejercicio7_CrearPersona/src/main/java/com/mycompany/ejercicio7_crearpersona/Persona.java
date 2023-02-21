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
    
    public void crearPersona()
    {
        //ifs o switch para que elija alguna opc
        Scanner ingSex = new Scanner(System.in);
        System.out.println("Ingrese su sexo: H. Hombre \n M. Mujer \n O. Otro");
    }
}
