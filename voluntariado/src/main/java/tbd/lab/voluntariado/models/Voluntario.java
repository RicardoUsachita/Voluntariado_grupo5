package tbd.lab.voluntariado.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@EntityScan
public class Voluntario {

    public Integer id;
    public String nombre;
    public Date nacimiento;

    public Voluntario(Integer id, String nombre, Date nacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
}
