/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MartinOviedo
 */
public class Alumno extends Persona {

    private boolean facilitador;

    public Alumno(boolean facilitador) {
        this.facilitador = facilitador;
    }

    public Alumno() {
    }

    public Alumno(boolean facilitador, String nombre, String apellido, Integer dni, Date fechaNacimiento) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.facilitador = facilitador;
    }

    public boolean isFacilitador() {
        return facilitador;
    }

    public void setFacilitador(boolean facilitador) {
        this.facilitador = facilitador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    

    public void llenarAlumno() {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el nombre del alumno");
        String nombre = scan.next();

        System.out.println("Ingrese el apellido del alumno");
        String apellido = scan.next();

        System.out.println("Ingrese el dni del alumno");
        Integer dni = scan.nextInt();

        System.out.println("Ingrese el dia de la fecha de nacimiento");
        int dia = scan.nextInt();

        System.out.println("Ingrese el mes de la fecha de nacimiento");
        int mes = scan.nextInt();

        System.out.println("Ingrese el año de la fecha de nacimiento");
        int anio = scan.nextInt();

        Date fechaNacimiento = new Date();

        fechaNacimiento.setDate(dia);
        fechaNacimiento.setMonth(mes);
        fechaNacimiento.setYear(anio);
        
        super.nombre = nombre;
        super.apellido = apellido;
        super.dni = dni;
        super.fechaNacimiento = fechaNacimiento;

        facilitador = true;

    }
    
    
    @Override
    public String toString() {
        return "Alumno{" + "\n"
                + "\t" + "Nombre: " + super.nombre + "\n"
                + "\t" + "Apellido: " + super.apellido + "\n"
                + "\t" + "Dni: " + super.dni + "\n"
                + "\t" + "Fecha Nacimiento: " + super.fechaNacimiento + "\n"
                + "\t" + "Facilitador: " + facilitador + "\n"
                + '}';
    }
    

    @Override
    public Integer calcularEdad() {
        
        Date fechaActual = new Date();
        
        int edad;

        edad = (fechaActual.getYear() + 1900) - fechaNacimiento.getYear();
        
        return edad;
    }

    @Override
    public void codear() {
        
        System.out.println("Esta aprendiendo");
        
        
        
    }

   
}
