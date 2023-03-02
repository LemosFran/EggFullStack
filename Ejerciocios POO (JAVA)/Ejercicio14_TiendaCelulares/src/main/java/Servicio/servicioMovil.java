/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */

/*Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:

 Un constructor por defecto.

 Un constructor con todos los atributos como parámetro.

 Métodos getters y setters de cada atributo.

 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.

 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo*/

public class servicioMovil {
    //Character.getNumericValue(digitos.charAt(i)
    //codigo[i] = Character.getNumericValue(num.charAt(i));
   
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Movil cargarCelular()
    { 
        Movil m1 = new Movil();
        System.out.println("Ingrese la marca del celular"); 
        m1.setMarca(scan.nextLine());
        System.out.println("Ingrese el precio");
        m1.setPrecio(scan.nextDouble());
        System.out.println("Ingrese el (modelo en años)");
        m1.setModelo(scan.nextInt());
        System.out.println("Ingrese la cantidad de memoria Ram en GB");
        m1.setMemoriaRam(scan.nextInt());
        System.out.println("Ingrese la capacidad de almacenamiento interno");
        m1.setAlmacenamiento(scan.nextInt());
        
        int [] code = new int [7];
        
        for (int i = 0; i < m1.getCodigo().length; i++) {
            System.out.println("Ingrese el codigo");
            code[i] = scan.nextInt();
             
            
        }
            m1.setCodigo(code);
        
       return m1;
    }
}
