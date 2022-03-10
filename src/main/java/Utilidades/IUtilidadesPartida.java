package Utilidades;

import modelos.Jugador;
import modelos.Partida;
import modelos.Personaje;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public interface IUtilidadesPartida {

    private void inicializarPartida(Partida partida, List<Jugador>
            participantes, List<Personaje> personajesDisponibles){

        Map<Jugador,Personaje> MapaInicio = new HashMap<>();
        Personaje personajeFavorito;

        for (Jugador j1: participantes){
            for (Personaje p1 : personajesDisponibles){
                if (j1.getPersonajesFavoritos().equals(p1)){
                    personajeFavorito = (Personaje) j1.getPersonajesFavoritos();
                    MapaInicio.put(j1, personajeFavorito);
                }
                else
                    MapaInicio.put(j1,p1);
            }
        }

        Map<Integer,Jugador> jugadoresPorEquipo = new HashMap<>();

        Random r = new Random();
        Integer equipoAleatorio = r.nextInt(2);

        if (participantes.size() % 2 ==0){
            for (Jugador j1 : participantes){
                jugadoresPorEquipo.put(equipoAleatorio,j1);
            }
        }


       /* for (Jugador j1 : participantes){
            if (participantes.size() % 2 == 0){
                jugadoresPorEquipo.put(equipoAleatorio, j1);
            }
        }*/

        partida.setIniciPartida(LocalDateTime.now());


    }
    private void finalizarPartida(Partida partida, Integer equipoVencedor){

        partida.setFinPartida(LocalDateTime.now());


    }
}
