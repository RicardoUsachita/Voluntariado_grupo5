package tbd.lab.voluntariado.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@EntityScan
public class Emergencia {
    public Long id;
    public String nombre;
    public String descripcion;
    public Date finicio;
    public Boolean activo;
    public Integer id_institucion;
    public Double longitud;
    public Double latitud;
    public String geom;

    public Emergencia(Long id, String nombre, String descrip, Date finicio,
                      Boolean activo, Integer id_institucion,
                      Double longitud, Double latitud, String geom) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descrip;
        this.finicio = finicio;
        this.activo = activo;
        this.id_institucion = id_institucion;
        this.longitud = longitud;
        this.latitud = latitud;
        this.geom = geom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Date getFinicio() {
        return finicio;
    }

    public void setFinicio(Date finicio) {
        this.finicio = finicio;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getId_institucion() {
        return id_institucion;
    }

    public void setId_institucion(Integer id_institucion) {
        this.id_institucion = id_institucion;
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
