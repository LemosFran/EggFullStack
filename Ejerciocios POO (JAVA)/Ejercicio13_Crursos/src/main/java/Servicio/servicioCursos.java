/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import java.util.Scanner;
import Entidad.Cursos;
/**
 *
 * @author Usuario
 */

public class servicioCursos {
    Scanner leer = new Scanner(System.in);//probar con la solucion del video "DEFAULT"...
    //use delimiter \n
    
    
      public void cargarAlumnos(Cursos curso) {

        String[] nombreAlumnos = new String[5];

        for (int i = 0; i < nombreAlumnos.length; i++) {
            System.out.print("Ingrese nombre del alumno " + (i + 1) + ": ");
            nombreAlumnos[i] = leer.next();
        }
        curso.setAlumnos(nombreAlumnos);
        //curso es el paremetro que va a traer de los atrib.
    }

    public Cursos crearCurso() {
        
            Cursos p1 = new Cursos();
            
            System.out.print("Ingrese el nombre del curso: ");
            p1.setNombreCurso(leer.nextLine());
            System.out.print("Ingrese cantidad de horas del curso: ");
            p1.setCantidadHorasPorDia(leer.nextInt());
            System.out.println("Ingrese cuantos dias por semana: ");
            p1.setCantidadDiasPorSemana(leer.nextInt());
            System.out.println("Ingrese turnos");
            p1.setTurno(leer.nextLine());
            System.out.println("Ingrese precio por hora");
            p1.setPrecioPorHora(leer.nextInt());
            
            return p1;
        

    }
}
