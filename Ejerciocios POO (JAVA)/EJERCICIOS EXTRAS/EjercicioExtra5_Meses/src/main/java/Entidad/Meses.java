/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author franc
 Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
 */

public class Meses {
 private String [] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "juliio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
 private int mesSecreto = 9;

    public Meses() {
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public int getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(int mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
 
    
}
