package tbd.lab.voluntariado.services;

import org.springframework.web.bind.annotation.*;
import tbd.lab.voluntariado.models.Tarea;
import tbd.lab.voluntariado.repositories.TareaRepository;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/")
public class TareaService {

    //Se hace uso de REST para la implementacion de las direciones para obtener los servicios.
    private final TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    @PostMapping("/tarea")
    public Tarea createTarea(@RequestBody Tarea tarea){
        System.out.println("Intento posting tarea...");
        return tareaRepository.createTarea(tarea);
    }
    @GetMapping("/tarea/{id}")
    public Tarea getTareaById(@PathVariable Integer id){
        return tareaRepository.getTareaById(id);
    }

    @GetMapping("/tarea")
    public List<Tarea> getAllTareas(){
        return tareaRepository.getAllTareas();

    }
    @GetMapping("/tarea/region/{id}")
    public List<Tarea> getTareasByIdRegion(@PathVariable Integer id){
        return tareaRepository.getTareasByIdRegion(id);
    }
    @PutMapping("/tarea")
    public Tarea updateTarea(@RequestBody Tarea tarea){
        return tareaRepository.updateTarea(tarea);
    }

    @DeleteMapping("/tarea/{id}")
    public void deleteTareaById(@PathVariable Integer id){
        tareaRepository.deleteTareaById(id);
    }

    @DeleteMapping("/tarea")
    public void deleteTareas(){
        tareaRepository.deleteTareas();
    }




}
