package tbd.lab.voluntariado.Repositories;

import tbd.lab.voluntariado.Models.EmeHabilidad;

import java.util.List;

public interface EmeHabilidadRepository {
    Integer generateId();
    EmeHabilidad createEmeHabilidad(EmeHabilidad emeHabilidad);
    EmeHabilidad getEmeHabilidadById(Integer id);
    List<EmeHabilidad> getAllEmeHabilidad();
    EmeHabilidad updateEmeHabilidad(EmeHabilidad emeHabilidad);
    void deleteEmeHabilidadById(Integer id);
    void deleteEmeHabilidad();

}
