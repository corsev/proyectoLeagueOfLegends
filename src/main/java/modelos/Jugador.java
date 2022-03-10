package modelos;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Jugador {
    private int id;
    private String nickname;
    Set<Personaje> personajesFavoritos;
    Map<Personaje,Integer> partidasGanadas;

    public Jugador(int id, String nickname, Set<Personaje> personajesFavoritos, Map<Personaje, Integer> partidasGanadas) {
        this.id = id;
        this.nickname = nickname;
        this.personajesFavoritos = personajesFavoritos;
        this.partidasGanadas = partidasGanadas;
    }
    public Jugador(Jugador j1) {
        this.id = j1.getId();
        this.nickname = j1.getNickname();
        this.personajesFavoritos = j1.getPersonajesFavoritos();
        this.partidasGanadas = j1.getPartidasGanadas();
    }

    public Jugador () {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Set<Personaje> getPersonajesFavoritos() {
        return personajesFavoritos;
    }

    public void setPersonajesFavoritos(Set<Personaje> personajesFavoritos) {
        this.personajesFavoritos = personajesFavoritos;
    }

    public Map<Personaje, Integer> getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(Map<Personaje, Integer> partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return id == jugador.id && Objects.equals(nickname, jugador.nickname) && Objects.equals(personajesFavoritos, jugador.personajesFavoritos) && Objects.equals(partidasGanadas, jugador.partidasGanadas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, personajesFavoritos, partidasGanadas);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", personajesFavoritos=" + personajesFavoritos +
                ", partidasGanadas=" + partidasGanadas +
                '}';
    }
}
