package modelos;

import java.util.Objects;

public class Habilidad {
    private int id;
    private String nombre;
    private Double danioBase;
    private Double danio;
    private Double costeMana;
    private TipoHabilidad tipoHabilidad;

    public Habilidad(int id, String nombre, Double danioBase,
                     Double danio, Double costeMana, TipoHabilidad tipoHabilidad) {
        this.id = id;
        this.nombre = nombre;
        this.danioBase = danioBase;
        this.danio = danio;
        this.costeMana = costeMana;
        this.tipoHabilidad = tipoHabilidad;
    }
    public Habilidad(Habilidad h1) {
        this.id = h1.getId();
        this.nombre = h1.getNombre();
        this.danioBase = h1.getdanioBase();
        this.danio = h1.getdanio();
        this.costeMana = h1.getCosteMana();
        this.tipoHabilidad = h1.getTipoHabilidad();
    }

    public Habilidad(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getdanioBase() {
        return danioBase;
    }

    public void setdanioBase(Double danioBase) {
        this.danioBase = danioBase;
    }

    public Double getdanio() {
        return danio;
    }

    public void setdanio(Double danio) {
        this.danio = danio;
    }

    public Double getCosteMana() {
        return costeMana;
    }

    public void setCosteMana(Double costeMana) {
        this.costeMana = costeMana;
    }

    public TipoHabilidad getTipoHabilidad() {
        return tipoHabilidad;
    }

    public void setTipoHabilidad(TipoHabilidad tipoHabilidad) {
        this.tipoHabilidad = tipoHabilidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habilidad habilidad = (Habilidad) o;
        return id == habilidad.id && Objects.equals(nombre, habilidad.nombre) && Objects.equals(danioBase, habilidad.danioBase) && Objects.equals(danio, habilidad.danio) && Objects.equals(costeMana, habilidad.costeMana) && tipoHabilidad == habilidad.tipoHabilidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, danioBase, danio, costeMana, tipoHabilidad);
    }

    @Override
    public String toString() {
        return "modelos.Habilidad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", dañoBase=" + danioBase +
                ", daño=" + danio +
                ", costeMana=" + costeMana +
                ", tipoHabilidad=" + tipoHabilidad +
                '}';
    }
}
