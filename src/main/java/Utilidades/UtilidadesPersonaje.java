package Utilidades;

import modelos.Personaje;
import modelos.Region;

import javax.swing.*;
import java.util.*;
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

    public static Personaje levelDown(Personaje personaje){


        Integer nivel = personaje.getNivel() - 1;
        Double ataque = personaje.getAtaqueBase() - (nivel * personaje.getEscalabilidad().getIncrementoDanioNivel());
        Double defensa = personaje.getDefensaBase() - (nivel * personaje.getEscalabilidad().getIncrementoDefensaNivel());
        Double vida = personaje.getVida() - (nivel * personaje.getEscalabilidad().getIncrementoSaludNivel());
        Double mana = personaje.getAtaque() - (nivel * personaje.getEscalabilidad().getIncrementoManaNivel());

        personaje.setAtaque(ataque);
        personaje.setDefensa(defensa);
        personaje.setVida(vida);
        personaje.setMana(mana);
        personaje.setNivel(nivel);



        return personaje;
    }
    public static Map<Region, List<Personaje>> getPersonajesPorRegion(List<Personaje> personajes){
        Map<Region, List<Personaje>> fnl = new HashMap<>();

        fnl = personajes.stream().collect(Collectors.groupingBy(p -> p.getRegion()));


        return fnl;
    }

    public static Personaje getMasPoderoso(List<Personaje> personaje) {

        Personaje personaje_final = new Personaje();
        Double poder_del_mas_poderoso = 0.0;
        Map<Personaje, Double> Personaje_valores_totales = new HashMap<>();

        for (Personaje personaje1 : personaje){


            while (personaje1.getNivel() < 18 ){
                levelUp(personaje1);
            }

             while (personaje1.getNivel() > 18 ){
                levelDown(personaje1);
            }
        }

        for (Personaje personaje1 : personaje){


            Double personaje_sumado = personaje1.getAtaque() + personaje1.getVida() + personaje1.getDefensa() + personaje1.getMana();

            // si el personaje_sumado > poder_del_mas_poderoso
            // personaje_final -> personaje1
            //poder_del_mas_poderoso -> pesonaje_sumado

            if (personaje_final.getNombre() == null){
                personaje_final = personaje1;
            }


            if (personaje_sumado > (personaje_final.getAtaque() + personaje_final.getVida() + personaje_final.getDefensa() + personaje_final.getMana()))
            {
                personaje_final = personaje1;
            }
            else
                poder_del_mas_poderoso = personaje_sumado;
        }


        return personaje_final;
    }

    public static Map<Region, List<Personaje>> getMasPoderosoPorRegion(List<Personaje> personajes){
        Map<Region, List<Personaje>> poderoso_por_region = new HashMap<>();
        List<Personaje> l1 = new ArrayList<>();
        List<Personaje> l2 = new ArrayList<>();
        List<Personaje> l3 = new ArrayList<>();
        List<Personaje> l4 = new ArrayList<>();
        List<Personaje> l5 = new ArrayList<>();
        List<Personaje> l6 = new ArrayList<>();
        List<Personaje> l7 = new ArrayList<>();
        List<Personaje> l8 = new ArrayList<>();
        List<Personaje> l9 = new ArrayList<>();
        List<Personaje> l10 = new ArrayList<>();
        List<Personaje> l11 = new ArrayList<>();





        //Sacar todos los pesonajes por region

        for (Personaje personaje1 : personajes){
            if (personaje1.getRegion() == Region.DEMACIA){
                l1.add(personaje1);

            }
            else if (personaje1.getRegion() == Region.DESCONOCIDA){
                l2.add(personaje1);

            }
            else if (personaje1.getRegion() == Region.AGUAS_ESTANCADAS){
                l3.add(personaje1);

            }
            else if (personaje1.getRegion() == Region.BANDLE){
                l4.add(personaje1);

            }
            else if (personaje1.getRegion() == Region.FREIJORD){
                l5.add(personaje1);

            }
            else if (personaje1.getRegion() == Region.JONIA){
                l6.add(personaje1);

            }
            else if (personaje1.getRegion() == Region.NOXUS){
                l7.add(personaje1);

            }
            else if (personaje1.getRegion() == Region.PILTOVER){
                l8.add(personaje1);

            }
            else if (personaje1.getRegion() == Region.SHURIMA){
                l9.add(personaje1);

            }
            else if (personaje1.getRegion() == Region.TARGON){
                l10.add(personaje1);

            }
            else
                l11.add(personaje1);

            }

        Personaje personaje1 = getMasPoderoso(l1);
        Personaje personaje2 = getMasPoderoso(l2);
        Personaje personaje3 = getMasPoderoso(l3);
        Personaje personaje4 = getMasPoderoso(l4);
        Personaje personaje5 = getMasPoderoso(l5);
        Personaje personaje6 = getMasPoderoso(l6);
        Personaje personaje7 = getMasPoderoso(l7);
        Personaje personaje8 = getMasPoderoso(l8);
        Personaje personaje9 = getMasPoderoso(l9);
        Personaje personaje10 = getMasPoderoso(l10);
        Personaje personaje11 = getMasPoderoso(l11);

        l1.clear();
        l2.clear();
        l3.clear();
        l4.clear();
        l5.clear();
        l6.clear();
        l7.clear();
        l8.clear();
        l9.clear();
        l10.clear();
        l11.clear();




        l1.add(personaje1);
        l2.add(personaje2);
        l3.add(personaje3);
        l4.add(personaje4);
        l5.add(personaje5);
        l6.add(personaje6);
        l7.add(personaje7);
        l8.add(personaje8);
        l9.add(personaje9);
        l10.add(personaje10);
        l11.add(personaje11);

        if (personaje1.getNombre() != null) {
            poderoso_por_region.put(Region.DEMACIA, l1);
        }
        if (personaje2.getNombre() != null) {
            poderoso_por_region.put(Region.DESCONOCIDA, l2);
        }
        if (personaje3.getNombre() != null) {
            poderoso_por_region.put(Region.AGUAS_ESTANCADAS, l3);
        }
        if (personaje4.getNombre() != null) {
            poderoso_por_region.put(Region.BANDLE, l4);
        }
        if (personaje5.getNombre() != null) {
            poderoso_por_region.put(Region.FREIJORD, l5);
        }
        if (personaje6.getNombre() != null) {
            poderoso_por_region.put(Region.JONIA, l6);
        }
        if (personaje7.getNombre() != null) {
            poderoso_por_region.put(Region.NOXUS, l7);
        }
        if (personaje8.getNombre() != null) {
            poderoso_por_region.put(Region.PILTOVER, l8);
        }
        if (personaje9.getNombre() != null) {
            poderoso_por_region.put(Region.SHURIMA, l9);
        }
        if (personaje10.getNombre() != null) {
            poderoso_por_region.put(Region.TARGON, l10);
        }
        if (personaje11.getNombre() != null) {
            poderoso_por_region.put(Region.ZAUN, l11);
        }








        return poderoso_por_region;
    }

}

