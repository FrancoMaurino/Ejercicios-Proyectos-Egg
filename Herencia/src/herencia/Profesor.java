
package herencia;

import java.util.Date;
import java.util.Scanner;


public class Profesor extends Persona {

    private Integer horasDeTrabajo;

    public Profesor() {
    }

    public Profesor(Integer horasDeTrabajo) {
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public Profesor(Integer horasDeTrabajo, String nombre, String apellido, Integer dni, Date fechaNacimiento) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public Integer getHorasDeTrabajo() {
        return horasDeTrabajo;
    }

    public void setHorasDeTrabajo(Integer horasDeTrabajo) {
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public void llenarProfesor() {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el nombre del alumno");
        String nombre = scan.next();

        System.out.println("Ingrese el apellido del alumno");
        String apellido = scan.next();

        System.out.println("Ingrese el dni del alumno");
        Integer dni = scan.nextInt();

        System.out.println("Ingrese las horas de trabajo del profesor");
        Integer horas = scan.nextInt();

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

        horasDeTrabajo = horas;
        super.nombre = nombre;
        super.apellido = apellido;
        super.dni = dni;
        super.fechaNacimiento = fechaNacimiento;

    }

    @Override
    public void codear() {

        System.out.println("Codea Standard");

    }

    @Override
    public String toString() {
        return "Profesor{" + "horasDeTrabajo=" + horasDeTrabajo + '}';
    }
    

    @Override
    public Integer calcularEdad() {
       
        Date fechaActual = new Date();
        
        int edad;

        edad = (fechaActual.getYear() + 1900) - fechaNacimiento.getYear();
        
        return edad;

    }
}
