package co.edu.uniquindio.poo;

import java.time.LocalDate;
import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public abstract class Persona {
    private final String nombre;
    private final String apellido;
    private final LocalDate fechaNacimiento;
    private final String nacionalidad;


    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad) {
        ASSERTION.assertion(nombre != null, "El nombre es requerido");
        ASSERTION.assertion(apellido != null, "El apellido es requerido");
        ASSERTION.assertion(nacionalidad != null, "El nacionalidad es requerido");
        ASSERTION.assertion(fechaNacimiento != null, "La fecha de nacimiento es requerida");
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "" + nombre + "" + apellido + ", fechaNacimiento=" + fechaNacimiento
                + ", nacionalidad=" + nacionalidad + "\n";
    }

    

}