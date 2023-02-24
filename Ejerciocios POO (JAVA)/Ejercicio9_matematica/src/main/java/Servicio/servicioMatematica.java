/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author franc
 */
public class servicioMatematica {
    Matematica mat1 = new Matematica();
    
    public void mostrarMenor(Matematica num1, Matematica num2)
    {
        int menor = Math.min(num1.getNumero1(), num2.getNumero2());
        System.out.println("El numero menor es: "+ menor);
    }
    
    public Matematica CalcularPotencia(Matematica num1, Matematica num2)
    {
        int menor2 = Math.min(num1.getNumero1(), num2.getNumero2());
        double potencia = Math.pow((double)menor2,(double) 2);
        System.out.println("Calculo de potencia del nro menor: "+potencia);
        return null;
    }
    
    public void calcularRaiz(Matematica num1, Matematica num2)
    {
        int menor3 = Math.min(num1.getNumero1(), num2.getNumero2());
        double raiz = Math.sqrt((double)menor3);
        System.out.println("La raiz del menor es: "+raiz);
    }
    
}
