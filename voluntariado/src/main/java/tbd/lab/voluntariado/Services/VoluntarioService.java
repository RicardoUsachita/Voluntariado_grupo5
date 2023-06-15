package tbd.lab.voluntariado.Services;

import tbd.lab.voluntariado.Repositories.VoluntarioRepository;
import org.springframework.web.bind.annotation.*;
import tbd.lab.voluntariado.Models.Voluntario;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/")
public class VoluntarioService {
    //Se hace uso de REST para la implementacion de las direciones para obtener los servicios.
    private final tbd.lab.voluntariado.Repositories.VoluntarioRepository VoluntarioRepository;
    VoluntarioService(VoluntarioRepository VoluntarioRepository){ this.VoluntarioRepository = VoluntarioRepository; }

    @PostMapping("/voluntarios")
    public Voluntario createVoluntario(@RequestBody Voluntario Voluntario){
        System.out.println("Intento posting...");
        return VoluntarioRepository.createVoluntario(Voluntario);
    }

    @GetMapping("/voluntarios/{id}")
    public Voluntario getVoluntarioById(@PathVariable Integer id){
        return VoluntarioRepository.getVoluntarioById(id);
    }

    @GetMapping("/voluntarios")
    public List<Voluntario> getAllVoluntarioes(){
        return VoluntarioRepository.getAllVoluntarios();

    }
    @PutMapping("/voluntarios")
    public Voluntario updateVoluntarioes(@RequestBody Voluntario Voluntario){
        return VoluntarioRepository.updateVoluntario(Voluntario);
    }

    @DeleteMapping("/voluntarios/{id}")
    public void deleteVoluntarioById(@PathVariable Integer id){
        VoluntarioRepository.deleteVoluntarioById(id);
    }

    @DeleteMapping("/voluntarios")
    public void deleteVoluntarioes(){
        VoluntarioRepository.deleteVoluntarios();
    }


    @PostMapping("/voluntarios/view/{id}")
    public void generateViewByIdEmergencia(@PathVariable String id){
        System.out.println("Id de emergencia: "+id);
        System.out.println("Intento posting generate view...");
        VoluntarioRepository.generateViewByIdEmergencia(id);
    }
}