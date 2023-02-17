/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5_cuentabancaria;

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

public class Ejercicio5_CuentaBancaria {

    public static void main(String[] args) {
        Cuentas c1 = new Cuentas();
        // si no se pone el cont vacio aca me salta error
        //porque me pide rellenar los parametros
        
        System.out.println("");
        
        c1.ingresoDatos();
        c1.agregarFondos();
        c1.retirarFondos();
//        c1.retiroExpress();
//        c1.consultarSaldo();
//        c1.consultarDatos();

        System.out.println(c1.toString());

    }
    
}
