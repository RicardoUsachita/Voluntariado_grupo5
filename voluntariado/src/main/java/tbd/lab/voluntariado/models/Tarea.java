package tbd.lab.voluntariado.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@EntityScan
public class Tarea {
    public int id;
    public String nombre;
    public String descripcion;
    public Integer cant_vol_requeridos;
    public Integer cant_vol_inscritos;
    public Integer id_emergencia;
    public Date finicio;
    public Date ffin;
    public Integer id_estado;
    public Double longitud;
    public Double latitud;
    public String geom;

    public Tarea(int id, String nombre, String descripcion,
                 Integer cant_vol_requeridos, Integer cant_vol_inscritos,
                 Integer id_emergencia, Date finicio, Date ffin,
                 Integer id_estado, Double longitud, Double latitud, String geom) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cant_vol_requeridos = cant_vol_requeridos;
        this.cant_vol_inscritos = cant_vol_inscritos;
        this.id_emergencia = id_emergencia;
        this.finicio = finicio;
        this.ffin = ffin;
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

    public Integer getCant_vol_requeridos() {
        return cant_vol_requeridos;
    }

    public void setCant_vol_requeridos(Integer cant_vol_requeridos) {
        this.cant_vol_requeridos = cant_vol_requeridos;
    }

    public Integer getCant_vol_inscritos() {
        return cant_vol_inscritos;
    }

    public void setCant_vol_inscritos(Integer cant_vol_inscritos) {
        this.cant_vol_inscritos = cant_vol_inscritos;
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

    public Date getFfin() {
        return ffin;
    }

    public void setFfin(Date ffin) {
        this.ffin = ffin;
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
