package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;


public class Cine {
    private final String nombre;
    private final Collection<Pelicula> listaPeliculas;


    public Cine(String nombre) {
                
        ASSERTION.assertion( nombre != null && !nombre.isBlank(), "El nombre es requerido");
        this.nombre = nombre;
        this.listaPeliculas = new LinkedList<>();
                
    }

    public Collection<Actor> obtenerActoresDrama(Collection<Actor> actores) {
        Predicate<Pelicula> condicion = pelicula -> pelicula.getGenero() == Genero.DRAMA;
        return actores.stream()
                .filter((actor) -> actor.getParticipaciones().stream().anyMatch(condicion))
                .toList();
        }

   
}


