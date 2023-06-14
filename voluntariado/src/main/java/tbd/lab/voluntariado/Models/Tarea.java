package tbd.lab.voluntariado.Models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@EntityScan
public class Tarea {
    public int id;
    public String nombre;
    public String descripcion;
    public Integer id_emergencia;
    public Date finicio;

    public Integer id_estado;
    public Double longitud;
    public Double latitud;
    public String geom;

    public Tarea(int id, String nombre, String descripcion,
                 Integer id_emergencia, Date finicio,
                 Integer id_estado, Double longitud, Double latitud, String geom) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id_emergencia = id_emergencia;
        this.id_estado = id_estado;
        this.longitud = longitud;
        this.latitud = latitud;
        this.geom = geom;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public Integer getId_emergencia() {
        return id_emergencia;
    }

    public void setId_emergencia(Integer id_emergencia) {
        this.id_emergencia = id_emergencia;
    }

    public Date getFinicio() {
        return finicio;
    }

    public void setFinicio(Date finicio) {
        this.finicio = finicio;
    }



    public Integer getId_estado() {
        return id_estado;
    }

    public void setId_estado(Integer id_estado) {
        this.id_estado = id_estado;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public String getGeom() {
        return geom;
    }

    public void setGeom(String geom) {
        this.geom = geom;
    }
}
