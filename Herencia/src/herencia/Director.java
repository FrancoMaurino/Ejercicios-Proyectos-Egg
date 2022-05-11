package herencia;

import java.util.Date;

public class Director extends Persona {

    private Integer sueldo;

    public Director() {
    }

    public Director(Integer sueldo, String nombre, String apellido, Integer dni, Date fechaNacimiento) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.sueldo = sueldo;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Integer getDni() {
        return dni;
    }

    @Override
    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public void codear() {
        System.out.println("No codea");
    }

    @Override
    public Integer calcularEdad() {

        Date fechaActual = new Date();

        int edad;

        edad = (fechaActual.getYear() + 1900) - fechaNacimiento.getYear();

        return edad;

    }

}
