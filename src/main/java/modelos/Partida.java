package modelos;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Partida {
    private int id;
    private String codigo;
    private Double server;
    Map<Jugador,Personaje> elecciones;
    Map<Integer, Set<Jugador>> jugadoresPorEquipo;
    private LocalDateTime iniciPartida;
    private LocalDateTime finPartida;
    private int duracionPartida;
    private Integer equipoVencedor;

    public Partida(int id, String codigo, Double server, Map<Jugador, Personaje> elecciones, Map<Integer,
            Set<Jugador>> jugadoresPorEquipo, LocalDateTime iniciPartida, LocalDateTime finPartida, int duracionPartida, Integer equipoVencedor) {
        this.id = id;
        this.codigo = codigo;
        this.server = server;
        this.elecciones = elecciones;
        this.jugadoresPorEquipo = jugadoresPorEquipo;
        this.iniciPartida = iniciPartida;
        this.finPartida = finPartida;
        this.duracionPartida = duracionPartida;
        this.equipoVencedor = equipoVencedor;

    }

    public Partida(Partida p1) {
        this.id = p1.getId();
        this.codigo = p1.getCodigo();
        this.server = p1.getServer();
        this.elecciones = p1.getElecciones();
        this.jugadoresPorEquipo = p1.getJugadoresPorEquipo();
        this.iniciPartida = p1.getIniciPartida();
        this.finPartida = p1.getFinPartida();
        this.duracionPartida = p1.getDuracionPartida();
        this.equipoVencedor = p1.getEquipoVencedor();

    }

    public Partida(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getServer() {
        return server;
    }

    public void setServer(Double server) {
        this.server = server;
    }

    public Map<Jugador, Personaje> getElecciones() {
        return elecciones;
    }

    public void setElecciones(Map<Jugador, Personaje> elecciones) {
        this.elecciones = elecciones;
    }

    public Map<Integer, Set<Jugador>> getJugadoresPorEquipo() {
        return jugadoresPorEquipo;
    }

    public void setJugadoresPorEquipo(Map<Integer, Set<Jugador>> jugadoresPorEquipo) {
        this.jugadoresPorEquipo = jugadoresPorEquipo;
    }

    public LocalDateTime getIniciPartida() {
        return iniciPartida;
    }

    public void setIniciPartida(LocalDateTime iniciPartida) {
        this.iniciPartida = iniciPartida;
    }

    public LocalDateTime getFinPartida() {
        return finPartida;
    }

    public void setFinPartida(LocalDateTime finPartida) {
        this.finPartida = finPartida;
    }

    public int getDuracionPartida() {
        return duracionPartida;
    }

    public void setDuracionPartida(int duracionPartida) {
        this.duracionPartida = duracionPartida;
    }

    public Integer getEquipoVencedor() {
        return equipoVencedor;
    }

    public void setEquipoVencedor(Integer equipoVencedor) {
        this.equipoVencedor = equipoVencedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partida partida = (Partida) o;
        return id == partida.id && duracionPartida == partida.duracionPartida && Objects.equals(codigo, partida.codigo) && Objects.equals(server, partida.server) && Objects.equals(elecciones, partida.elecciones) && Objects.equals(jugadoresPorEquipo, partida.jugadoresPorEquipo) && Objects.equals(iniciPartida, partida.iniciPartida) && Objects.equals(finPartida, partida.finPartida) && Objects.equals(equipoVencedor, partida.equipoVencedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo, server, elecciones, jugadoresPorEquipo, iniciPartida, finPartida, duracionPartida, equipoVencedor);
    }

    @Override
    public String toString() {
        return "Partida{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", server=" + server +
                ", elecciones=" + elecciones +
                ", jugadoresPorEquipo=" + jugadoresPorEquipo +
                ", iniciPartida=" + iniciPartida +
                ", finPartida=" + finPartida +
                ", duracionPartida=" + duracionPartida +
                ", equipoVencedor=" + equipoVencedor +
                '}';
    }
}
