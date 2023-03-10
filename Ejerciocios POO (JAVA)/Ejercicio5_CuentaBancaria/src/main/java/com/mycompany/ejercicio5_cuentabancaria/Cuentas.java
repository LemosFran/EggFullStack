/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5_cuentabancaria;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */

/* Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f)
 Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/


public class Cuentas {
    private int numeroDeCuenta;
    private int dni;
    private double saldoActual;

    public Cuentas() {
    }
    
    
    
    //constructor
    public Cuentas(int numeroDeCuenta, int dni, int saldoActual) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }
    
    //Getters & Setters

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    /**
     * Datos de la cuenta
     */
    public void ingresoDatos()
    {
        Scanner ingDat = new Scanner(System.in);
        System.out.println("Ingrese el número de cuenta");
        numeroDeCuenta = ingDat.nextInt();
        
        
        System.out.println("Ingrese el número de DNI");
        dni = ingDat.nextInt();
        
       
        System.out.println("Ingrese el monto a cargar en su cuenta");
        saldoActual = ingDat.nextInt();
    }
    
    /**
     * Método para ingresar dinero y sumarselo al saldoActual
     */
    
    public void agregarFondos() // solucionado
    {
        Scanner addFondos = new Scanner(System.in);
        System.out.println("¿Cuanto dinero desea ingresar?");
        
        // con el saldoAct addfondo.nex aca entra en un bucle 
        saldoActual += addFondos.nextDouble();
        
        System.out.println("Su nuevo saldo es: " + saldoActual);

        
        
    }
        
    /**
     * Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
     */
    
    public void retirarFondos() 
    {
        Scanner retFon = new Scanner(System.in);
        System.out.println("¿Cuanto dinero desea retirar?");
        double retiroFondos = retFon.nextDouble();
        // con esta var se arregla el sobrecargo y bucle de scanners o lectores
        
        if(retiroFondos < saldoActual)
        {
           saldoActual -= retiroFondos; 
            System.out.println("Su saldo actual es: " + saldoActual);
        }else
        {
            System.out.println("Saldo insufuciente");
            
            
        }
    }
    
    /**
     *  Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
     */
    
    public void retiroExpress()
    {
        Scanner rExp = new Scanner(System.in);
        System.out.println("¿Desea hacer un retiro express? \n 1.Si \n 2.Salir");
        int porcent = rExp.nextByte();
        
        if(porcent == 1)
        {
            double retPorc = (20 * saldoActual ) / 100 ;
            saldoActual -= retPorc;
            System.out.println("su retiro fue de: $"+ retPorc );
        }else if(rExp.nextInt() == 2)
        {
            System.out.println("No se realizara la extraccion express. Muchas gracias");
        }else
        {
            System.out.println("Esa opcion no es válida");
        }
    }
    
    // consulta saldo
    public void consultarSaldo()
    {
        System.out.println("su saldo es: $" + saldoActual);
    }
    
    // consultar datos
    public void consultarDatos()
    {
        System.out.println("Los datos de su cuenta sos: \n*NUMERO DE CUENTA: "+numeroDeCuenta + "\n DNI: "+dni+ "\n SALDO ACTUAL: $"+saldoActual);
    }

    @Override
    public String toString() {
        return "Cuentas{" + "numeroDeCuenta=" + numeroDeCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }
    
    
}
