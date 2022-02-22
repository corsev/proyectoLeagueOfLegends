package modelos;

import java.util.Objects;

public class Escalabilidad {

    private int id;
    private Double incrementoDanioNivel;
    private Double incrementoDefensaNivel;
    private Double incrementoSaludNivel;
    private Double incrementoManaNivel;

    public Escalabilidad(int id, Double incrementoDanioNiveloNivel,
                         Double incrementoDefensaNivel, Double incrementoSaludNivel, Double incrementoManaNivel) {
        this.id = id;
        this.incrementoDanioNivel = incrementoDanioNiveloNivel;
        this.incrementoDefensaNivel = incrementoDefensaNivel;
        this.incrementoSaludNivel = incrementoSaludNivel;
        this.incrementoManaNivel = incrementoManaNivel;
    }
    public Escalabilidad(Escalabilidad esc1) {
        this.id = esc1.getId();
        this.incrementoDanioNivel = esc1.getIncrementoDanioNivel();
        this.incrementoDefensaNivel = esc1.getIncrementoDefensaNivel();
        this.incrementoSaludNivel = esc1.getIncrementoSaludNivel();
        this.incrementoManaNivel = esc1.getIncrementoManaNivel();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getIncrementoDanioNivel() {
        return incrementoDanioNivel;
    }

    public void setIncrementoDañoNivel(Double incrementoDanioNiveloNivel) {
        this.incrementoDanioNivel = incrementoDanioNiveloNivel;
    }

    public Double getIncrementoDefensaNivel() {
        return incrementoDefensaNivel;
    }

    public void setIncrementoDefensaNivel(Double incrementoDefensaNivel) {
        this.incrementoDefensaNivel = incrementoDefensaNivel;
    }

    public Double getIncrementoSaludNivel() {
        return incrementoSaludNivel;
    }

    public void setIncrementoSaludNivel(Double incrementoSaludNivel) {
        this.incrementoSaludNivel = incrementoSaludNivel;
    }

    public Double getIncrementoManaNivel() {
        return incrementoManaNivel;
    }

    public void setIncrementoManaNivel(Double incrementoManaNivel) {
        this.incrementoManaNivel = incrementoManaNivel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Escalabilidad that = (Escalabilidad) o;
        return id == that.id && Objects.equals(incrementoDanioNivel, that.incrementoDanioNivel) && Objects.equals(incrementoDefensaNivel, that.incrementoDefensaNivel) && Objects.equals(incrementoSaludNivel, that.incrementoSaludNivel) && Objects.equals(incrementoManaNivel, that.incrementoManaNivel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, incrementoDanioNivel, incrementoDefensaNivel, incrementoSaludNivel, incrementoManaNivel);
    }

    @Override
    public String toString() {
        return "modelos.Escalabilidad{" +
                "id=" + id +
                ", incrementoDanioNiveloNivel=" + incrementoDanioNivel +
                ", incrementoDefensaNivel=" + incrementoDefensaNivel +
                ", incrementoSaludNivel=" + incrementoSaludNivel +
                ", incrementoManaNivel=" + incrementoManaNivel +
                '}';
    }
}
