package tbd.lab.voluntariado.repositories;

import tbd.lab.voluntariado.models.Emergencia;

import java.util.List;

public interface EmergenciaRepository {
    public Long newIdEmergencia();
    public List<Emergencia> getAllEmergencias();
    public void createEmergencia(Emergencia emergencia);

    public Emergencia getEmergenciaById(Long id);

    public void updateEmergencia(Emergencia emergencia);
    public void deleteEmergencia(Long id);






}
