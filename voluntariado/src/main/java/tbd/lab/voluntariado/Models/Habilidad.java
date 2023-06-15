package tbd.lab.voluntariado.Models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Habilidad {
    public int id;
    public String descripcion;
    public Habilidad(int id, String descrip) {
        this.id = id;
        this.descripcion = descrip;
    }

    public int getId() {
        return id;
    }
    //Se obtiene la descripcion de la habilidad
    public String getDescripcion() {
        return descripcion;
    }

}
