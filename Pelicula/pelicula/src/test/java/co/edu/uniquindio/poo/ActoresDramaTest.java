/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;



public class ActoresDramaTest {
    private static final Logger LOG = Logger.getLogger(ActoresDramaTest.class.getName());

    
    @Test
    public void validarBuenFuncionamientoObtenerActoresDrama() {
        LOG.info("Iniciando test para obtener los actores de genero drama con datos completos");

        Cine cine1 = new Cine("Zapato");
        Pelicula pelicula1 = new Pelicula("Maya la piedra filosofal","Maya encuentra una Piedra Filosofal antigua y se embarca en una aventura para descubrir su poder y protegerla de fuerzas malignas.",LocalDate.of(1972,05 , 23), Genero.DRAMA,"Colombia");
        Pelicula pelicula2 = new Pelicula("El Señor de los Anillos: El Retorno de Josue","Josue regresa para enfrentar un destino épico. En un mundo de fantasía, se une a valientes aliados en una búsqueda para restaurar el equilibrio y vencer al mal definitivo. Una batalla final épica espera a Josue en esta emocionante continuación.",LocalDate.of(1972,05 , 23),Genero.COMEDIA,"Colombia");
        Pelicula pelicula3 = new Pelicula("JulianGod","owo",LocalDate.of(1972,05 , 23),Genero.ACCION,"Colombia");
        Pelicula pelicula4 = new Pelicula("El ataque de ROBINSON","si pero no",LocalDate.of(1972,05 , 23),Genero.ROMANCE,"Colombia");

        Actor actor1 = new Actor("Carlitos","Mendoza",LocalDate.of(2007,05,05),"Peruano");
        actor1.agregarParticipacion(pelicula1);
        actor1.agregarParticipacion(pelicula2);
        actor1.agregarParticipacion(pelicula3);
        actor1.agregarParticipacion(pelicula4);


        Actor actor2 = new Actor("Elva","lazo",LocalDate.of(2007,05,05),"Peruana");

        actor2.agregarParticipacion(pelicula2);
        actor2.agregarParticipacion(pelicula3);
        actor2.agregarParticipacion(pelicula4);

        Actor actor3 = new Actor("Shakira","Lero Lole Lole",LocalDate.of(2007,05,05),"Peruano");
        
        actor3.agregarParticipacion(pelicula1);
        actor3.agregarParticipacion(pelicula2);
        actor3.agregarParticipacion(pelicula3);
        actor3.agregarParticipacion(pelicula4);

        Actor actor4 = new Actor("Charly","Flow",LocalDate.of(2007,05,05),"Peruan");

        
        actor4.agregarParticipacion(pelicula3);
        actor4.agregarParticipacion(pelicula4);

        LinkedList<Actor> listaActores = new LinkedList<Actor>();
        listaActores.add(actor1);
        listaActores.add(actor2);
        listaActores.add(actor3);
        listaActores.add(actor4);

        System.out.println("La lista de actores dramáticos es la siguiente:\n" + cine1.obtenerActoresDrama(listaActores));

        assertEquals(2, cine1.obtenerActoresDrama(listaActores).size());
        

        LOG.info("Finalizando test para obtener los actores de genero drama con datos completos");
    }

    @Test
    public void listaVacía() {
        LOG.info("Iniciando test lista vacía ");

        Cine cine1 = new Cine("Zapato");
        LinkedList<Actor> listaActores = new LinkedList<Actor>();
        assertEquals(0, cine1.obtenerActoresDrama(listaActores).size());
        

        LOG.info("Finalizando test lista vacía");
    }


    @Test
    public void listaNula() {
        LOG.info("Iniciando test lista nula");

        LinkedList<Actor> listaActores = null;
        assertThrows(Throwable.class,()-> new Cine("Zapato").obtenerActoresDrama(listaActores));
        

        LOG.info("Finalizando test lista nula");
    }
}
