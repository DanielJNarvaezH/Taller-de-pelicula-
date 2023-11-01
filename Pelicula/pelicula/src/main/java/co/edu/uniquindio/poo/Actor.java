package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Actor extends Persona {
    private final Collection<Pelicula> participaciones;

    public Actor(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.participaciones = new LinkedList<>();
    }

    public void agregarParticipacion(Pelicula pelicula) {
        participaciones.add(pelicula);
    }

    public Collection<Pelicula> getParticipaciones() {
        return Collections.unmodifiableCollection(participaciones);
    }

    @Override
    public String toString() {
        return "Actor:" +  super.toString(); 
    }

    


    



}