package Utilidades;

import modelos.Habilidad;
import modelos.Item;
import modelos.Personaje;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesHabilidad {

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

    public static void equiparItem(Personaje personaje, Item item){
        List<Item> i = personaje.getEquipamiento();
        i.add(item);

        personaje.setMana(item.getAumentoMana()+ personaje.getMana());
        personaje.setAtaque(item.getaumentoDanio()+ personaje.getAtaque());
        personaje.setDefensa(item.getAumentoDefensa()+ personaje.getDefensa());
        personaje.setVida(item.getAumentoSalud()+ personaje.getVida());

    }

    public static void golpearConHabilidad(Personaje emisor, Personaje receptor,
                                           Habilidad habilidadEmisor){


        List<Item> ListaEmisor = new ArrayList<>();
        for (Item i : emisor.getEquipamiento()){
            ListaEmisor.add(i);
        }


        List<Item> ListaReceptor = new ArrayList<>();
        for (Item i : receptor.getEquipamiento()){
            ListaReceptor.add(i);
        }



            while (emisor.getNivel() < 18 ){
                levelUp(emisor);
            }
            while (emisor.getNivel() > 18 ){
            levelDown(emisor);
            }
            while (receptor.getNivel() < 18 ){
                levelUp(receptor);
            }
            while (receptor.getNivel() > 18 ){
                levelDown(receptor);
            }
            if (!emisor.getEquipamiento().isEmpty()){
                for (Item i : ListaEmisor){
                    equiparItem(emisor, i);
                }

            }

            if (!receptor.getEquipamiento().isEmpty()){
                for (Item i : receptor.getEquipamiento()){
                    equiparItem(receptor, i);
                }
            }

            Double DanioHabilidadTotal = habilidadEmisor.getdanioBase() + (0.2 * emisor.getAtaqueBase() - (0.1 * receptor.getDefensa()));

            emisor.setMana(emisor.getMana() - habilidadEmisor.getCosteMana());

            receptor.setVida(receptor.getVida() - DanioHabilidadTotal);

    }

}
