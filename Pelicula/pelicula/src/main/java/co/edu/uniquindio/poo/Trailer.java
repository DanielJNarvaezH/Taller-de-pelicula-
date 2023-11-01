package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Trailer {
    private final Pelicula pelicula;
    private final Collection<Persona> editores;
    
    public Trailer(Pelicula pelicula) {
        this.pelicula = pelicula;
        this.editores = new LinkedList<>();
    }

    public Collection<Persona> getEditores() {
        return Collections.unmodifiableCollection(editores);
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    
    
}