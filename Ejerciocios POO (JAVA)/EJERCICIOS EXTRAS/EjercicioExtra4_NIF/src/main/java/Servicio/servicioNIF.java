/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import Entidad.NIF;
/**
 *
 * @author franc
 * documentar todo (buena paractica)
 */
public class servicioNIF {
  public int crearNIF(NIF en)
  {
      int calc = Math.round(en.getDni() % 23);
      System.out.println("resultado: " + calc);
      return calc;
  }
  
  //PARA USAR UN METODO DENTRO DEL OTRO LOS DOS DEBEN SER VOID O CON RETURN
  
    public int mostrar(NIF en)
    {
  //hacemos un array aca y con la posicion del array seteamos al atrib   
        int calculo = crearNIF(en);
        
        String [] letra = {"T","R","W","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        en.setLetra(letra[calculo-1]);//tener en cuenta que arranca desde 0 el orden
        System.out.println("Su DNI con su letra "+ en.getDni()+"-"+en.getLetra());
        
        return calculo;
    }
  
}
