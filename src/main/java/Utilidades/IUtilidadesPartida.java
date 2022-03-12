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
    void inicializarPartida(Partida partida, List<Jugador>
            participantes, List<Personaje> personajesDisponibles);

    void finalizarPartida(Partida partida, Integer equipoVencedor);


}