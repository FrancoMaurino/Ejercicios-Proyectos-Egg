/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;

public class Herencia {

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList();

        Alumno alumno = new Alumno();

        alumno.llenarAlumno();

        alumno.codear();

//        Profesor profesor = new Profesor();
//
//        profesor.llenarProfesor();
//
//        profesor.codear();

        personas.add(alumno);

//        personas.add(profesor);

        for (Persona pr : personas) {

            if (pr instanceof Alumno) {
                System.out.println("La edad de mi alumno es: " + pr.calcularEdad());
            }

        }
    }

}
