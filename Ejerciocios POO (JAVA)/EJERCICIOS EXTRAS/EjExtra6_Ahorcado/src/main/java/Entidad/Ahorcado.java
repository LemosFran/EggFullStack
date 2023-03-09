/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Ahorcado {
    private String [] palabraBuscada = new String[0]; //palabraBuscada = new String[tamaño];
//HACER UN EJEMPLO APARTE SOLO DE ESTO
    private int longVector, jugadasMax, letEncontradas;

    public Ahorcado() {
    }

    public Ahorcado(int longVector, int jugadasMax, int letEncontradas) {
        this.longVector = longVector;
        this.jugadasMax = jugadasMax;
        this.letEncontradas = letEncontradas;
    }

    public String[] getPalabraBuscada() {
        return palabraBuscada;
    }

    public void setPalabraBuscada(String[] palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    public int getLongVector() {
        return longVector;
    }

    public void setLongVector(int longVector) {
        this.longVector = longVector;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public int getLetEncontradas() {
        return letEncontradas;
    }

    public void setLetEncontradas(int letEncontradas) {
        this.letEncontradas = letEncontradas;
    }

    
    
   

   @Override
public String toString() {
    return "Ahorcado{" +
            "palabraBuscada=" + Arrays.toString(palabraBuscada) +
            ", longVector=" + longVector +
            ", jugadasMax=" + jugadasMax +
            ", letEncontradas=" + letEncontradas +
            '}';
}


   
    
    
}
