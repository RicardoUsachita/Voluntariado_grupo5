package tbd.lab.voluntariado.Repositories;

import tbd.lab.voluntariado.Models.Habilidad;

import java.util.List;

public interface HabilidadRepository {
    Integer generateId();
    Habilidad createHabilidad(Habilidad habilidad);
    Habilidad getHabilidadById(Integer id);
    List<Habilidad> getAllHabilidad();

    Habilidad updateHabilidad(Habilidad habilidad);
    void deleteHabilidadById(Integer id);
    void deleteHabilidades();
}
