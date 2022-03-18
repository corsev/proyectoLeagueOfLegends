package Utilidades;

import com.opencsv.CSVReader;
import modelos.*;


import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class UtilidadesFichero {
    public UtilidadesFichero() {

    }

    public static final char SEPARATOR = ',';


    public static List<Personaje> leerPersonajes() throws IOException {
        List<Personaje> listaFinal = new ArrayList<>();
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("C:\\Users\\daw20\\IdeaProjects\\proyectoLeagueOfLegends\\src\\main\\java\\documentos\\personajes.csv"), SEPARATOR);
            String[] nextline = null;
            int count = 0;

            while ((nextline = reader.readNext()) != null) {

                if (count > 0) {
                    String[] valores = nextline;
                    Personaje p = new Personaje();
                    p.setId(Integer.parseInt(valores[0]));
                    p.setNombre(valores[1]);
                    p.setFechaCreacion(LocalDate.parse(valores[2],DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    p.setAtaqueBase(Double.valueOf(valores[3]));
                    p.setDefensaBase(Double.valueOf(valores[4]));
                    p.setVidaBase(Double.valueOf(valores[5]));
                    p.setManaBase(Double.valueOf(valores[6]));
                    p.setRegion(Region.valueOf(valores[7]));
                    listaFinal.add(p);

                }
                count++;
            }

        } catch (Exception e) {
            throw e;
        }

        reader.close();

        return listaFinal;
    }

    public static List<Personaje> leerYAprenderHabilidades() throws IOException {

        List<Personaje> listaPersonaje = leerPersonajes();
        List<Habilidad> listaHabilidad = new ArrayList<>();
        Habilidad h = new Habilidad();


        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("C:\\Users\\daw20\\IdeaProjects\\proyectoLeagueOfLegends\\src\\main\\java\\documentos\\habilidades.csv"), SEPARATOR);
            String[] nextline = null;
            int count = 0;

            while ((nextline = reader.readNext()) != null) {

                if (count > 0) {
                    String[] valores = nextline;
                    h.setId(Integer.parseInt(valores[0]));
                    h.setNombre(valores[2]);
                    h.setdanioBase(Double.parseDouble(valores[3]));
                    h.setCosteMana(Double.parseDouble(valores[4]));
                    h.setTipoHabilidad(TipoHabilidad.valueOf(valores[5]));

                    listaHabilidad.add(h);

                    List<Habilidad> nuevah = new ArrayList<>();
                    nuevah.add(h);

                    for (Personaje p : listaPersonaje){
                        if (Integer.parseInt(valores[1]) == p.getId()){
                            if(p.getHabilidades() != null){
                                List<Habilidad> hab = new ArrayList<>();

                            for (Habilidad h1 : p.getHabilidades()) {
                                hab.add(h1);
                            }
                                hab.add(h);
                                p.setHabilidades(hab);
                            }
                            else{
                                p.setHabilidades(nuevah);
                            }
                        }
                    }
                        nuevah = null;
                }

                count++;


            }

        } catch (Exception e) {
            throw e;
        }

        reader.close();

        return listaPersonaje;
    }
    public static List<Item> leerItems() throws IOException {
        List<Item> listaItems = new ArrayList<>();
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("C:\\Users\\daw20\\IdeaProjects\\proyectoLeagueOfLegends\\src\\main\\java\\documentos\\items.csv"), SEPARATOR);
            String[] nextline = null;
            int count = 0;

            while ((nextline = reader.readNext()) != null) {

                if (count > 0) {
                    String[] valores = nextline;
                    Item i = new Item();
                    i.setId(Integer.parseInt(valores[0]));
                    i.setNombre(valores[1]);
                    i.setaumentoDanio(Double.valueOf(valores[2]));
                    i.setAumentoDefensa(Double.valueOf(valores[3]));
                    i.setAumentoSalud(Double.valueOf(valores[4]));
                    i.setAumentoMana(Double.valueOf(valores[5]));
                    listaItems.add(i);
                }
                count++;
            }

        } catch (Exception e) {
            throw e;
        }

        reader.close();


        return listaItems;
    }
}