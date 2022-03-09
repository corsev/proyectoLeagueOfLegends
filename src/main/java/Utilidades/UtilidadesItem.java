package Utilidades;

import modelos.Item;
import modelos.Personaje;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesItem {

    public void equiparItem(Personaje personaje, Item item){
        List<Item> i = personaje.getEquipamiento();
        i.add(item);

        personaje.setMana(item.getAumentoMana()+ personaje.getMana());
        personaje.setAtaque(item.getaumentoDanio()+ personaje.getAtaque());
        personaje.setDefensa(item.getAumentoDefensa()+ personaje.getDefensa());
        personaje.setVida(item.getAumentoSalud()+ personaje.getVida());

    }
}
