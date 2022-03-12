package Utilidades;


import modelos.Jugador;
import modelos.Partida;
import modelos.Personaje;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class UtilidadesPartida implements IUtilidadesPartida{
    public void inicializarPartida(Partida partida, List<Jugador>
            participantes, List<Personaje> personajesDisponibles){


        //Aqui se incializan las elecciones de los personajes
        inicializarElecciones(partida, participantes, personajesDisponibles);

        //Aqui se divide a los jugadores por equipo y se le asigna un numero de equipo.
        EleccionJugadoresEquipo(partida, participantes);

        //Seteamos la hora de inicio de partida.
        horaInicioPartida(partida);


    }

    private void horaInicioPartida(Partida partida) {
        partida.setIniciPartida(LocalDateTime.now());
    }

    private void EleccionJugadoresEquipo(Partida partida, List<Jugador> participantes) {
        Set<Jugador> set1 = new HashSet<>();
        Set<Jugador> set2 = new HashSet<>();

        if (participantes.size() % 2 ==0){
            for (Jugador j1 : participantes){
                if (set1.size() == (participantes.size()%2)){
                    set1.add(j1);
                }else
                    set2.add(j1);
            }
            partida.getJugadoresPorEquipo().put(1,set1);
            partida.getJugadoresPorEquipo().put(2,set2);

        }
    }

    private void inicializarElecciones(Partida partida, List<Jugador> participantes, List<Personaje> personajesDisponibles) {
        Personaje personajeFavorito;

        for (Jugador j1: participantes){
            for (Personaje p1 : personajesDisponibles){
                if (j1.getPersonajesFavoritos().equals(p1)){
                    personajeFavorito = (Personaje) j1.getPersonajesFavoritos();
                    partida.getElecciones().put(j1, personajeFavorito);
                    personajesDisponibles.remove(p1);
                }
                else
                    partida.getElecciones().put(j1,p1);
                    personajesDisponibles.remove(p1);
            }
        }
    }


    public void finalizarPartida(Partida partida, Integer equipoVencedor){


        //Obtenemos la duracion total de la partida en segundos
        duracionPartida(partida);

        // Añadimos al equipo vencedor el parametro que le pasamos
        equipoVencedorParametro(partida, equipoVencedor);

        // Actualiza las stats de los jugadores del equipo ganador
        actualizaPartidaGanada(partida, equipoVencedor);


    }

    private void actualizaPartidaGanada(Partida partida, Integer equipoVencedor) {
        Set<Jugador> ganadores = partida.getJugadoresPorEquipo().get(equipoVencedor);

        for (Jugador j1 : ganadores){
            Personaje p1 = partida.getElecciones().get(j1);
            if (!Objects.equals(p1, partida.getElecciones())){
                j1.getPartidasGanadas().put(p1, 1);

            }
            else
                j1.getPartidasGanadas().put(p1,+1);
        }
    }

    private void equipoVencedorParametro(Partida partida, Integer equipoVencedor) {
        partida.setEquipoVencedor(equipoVencedor);
    }

    private void duracionPartida(Partida partida) {
        partida.setFinPartida(LocalDateTime.now());

        LocalDateTime inicio = partida.getIniciPartida();
        LocalDateTime fin = partida.getFinPartida();

        int duracion = fin.getSecond() - inicio.getSecond();
        partida.setDuracionPartida(duracion);
    }

}
