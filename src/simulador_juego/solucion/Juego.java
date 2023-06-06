package simulador_juego.solucion;

import java.util.Enumeration;
import java.util.Hashtable;

public class Juego implements IJuego {

    private int numeroTiposEnemigos; // número T de tipos de enemigos
    private int numeroEnemigosPorTipo;// número N de enemigos de cada tipo T
    private int contadorEnemigosTotales;
    private Hashtable<Integer, Integer> contadoresEnemigoTipo;
    private Hashtable<Integer, Integer> contadoresEliminadosTipo;
    private int MAX_ENEMIGOS;   //número máximo M de enemigos al mismo tiempo de todos los tipos
    private int MIN_ENEMIGOS = 0;
    
}