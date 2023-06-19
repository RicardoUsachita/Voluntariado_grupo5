package tbd.lab.voluntariado.Models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.sql.Date;

@EntityScan
public class Emergencia {
    /**
     * ATRIBUTOS DE Emergencia
     * @param id de la emergencia
     * @param nombre de la emergencia
     * @param descripcion de la emergencia
     * @param fecha de la emergencia
     * @param reqs_grupales de la emergencia
     * @param reqs_individuales de la emergencia
     * @param longitude de la emergencia
     * @param latitude de la emergencia

     */
    private long id;
    private String nombre;
    private String descripcion;
    private Date fecha;
    private String reqs_grupales;
    private String reqs_individuales;
    private long longitude;
    private long latitude;

    //CONSTRUCTOR Emergencia
    public Emergencia(){
    }
    //CONSTRUCTOR Emergencia
    public Emergencia(long id, String nombre, String descripcion, java.sql.Date fecha, String reqs_grupales, String reqs_individuales, long longitude, long latitude){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.reqs_grupales = reqs_grupales;
        this.reqs_individuales = reqs_individuales;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    //GETTERS Emergencia


    public long getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public java.sql.Date getFecha() {
        return fecha;
    }


    public String getReqs_grupales() {
        return reqs_grupales;
    }


    public String getReqs_individuales() {
        return reqs_individuales;
    }


    public long getLongitude() {
        return longitude;
    }

    public long getLatitude() {
        return latitude;
    }

    //SETTERS Emergencia


    public void setId(long id) {
        this.id = id;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setReqs_grupales(String reqs_grupales) {
        this.reqs_grupales = reqs_grupales;
    }


    public void setReqs_individuales(String reqs_individuales) {
        this.reqs_individuales = reqs_individuales;
    }


    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }


    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    //TOSTRING Emergencia


    @Override
    public String toString() {
        return "Emergencia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", reqs_grupales='" + reqs_grupales + '\'' +
                ", reqs_individuales='" + reqs_individuales + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }

}
