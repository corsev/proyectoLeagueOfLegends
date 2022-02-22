package Utilidades;

import modelos.Personaje;
import modelos.Region;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UtilidadesPersonaje {

    public static Personaje levelUp(Personaje personaje){


        Integer nivel = personaje.getNivel() + 1;
        Double ataque = personaje.getAtaqueBase() + (nivel * personaje.getEscalabilidad().getIncrementoDanioNivel());
        Double defensa = personaje.getDefensaBase() + (nivel * personaje.getEscalabilidad().getIncrementoDefensaNivel());
        Double vida = personaje.getVida() + (nivel * personaje.getEscalabilidad().getIncrementoSaludNivel());
        Double mana = personaje.getAtaque() + (nivel * personaje.getEscalabilidad().getIncrementoManaNivel());

        personaje.setAtaque(ataque);
        personaje.setDefensa(defensa);
        personaje.setVida(vida);
        personaje.setMana(mana);
        personaje.setNivel(nivel);



        return personaje;
    }

    public Map<Region, List<Personaje>> getPersonajesPorRegion(List<Personaje> personajes){
        Map<Region, List<Personaje>> fnl = new HashMap<>();

        fnl = personajes.stream().collect(Collectors.groupingBy(p -> p.getRegion()));


        return fnl;
    }

    public Personaje getMasPoderoso(List<Personaje> personaje) {

        Personaje personaje_final = new Personaje();




        return personaje_final;
    }


}
