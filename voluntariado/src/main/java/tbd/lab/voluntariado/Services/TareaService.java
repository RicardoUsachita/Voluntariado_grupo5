package tbd.lab.voluntariado.Services;

import org.springframework.web.bind.annotation.*;
import tbd.lab.voluntariado.Models.Tarea;
import tbd.lab.voluntariado.Repositories.TareaRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/tarea")
public class TareaService {

    private final TareaRepository tareaRepository;

    /**
     * @param tareaRepository
     */
    TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    /**
     * @return {@value} List<Tarea> lista de tareas
     */
    @GetMapping
    public List<Tarea> getAll() {
        return tareaRepository.getAll();
    }

    /**
     * @param tarea tarea a crear
     * @return {@value} Tarea tarea
     */
    @PostMapping("/create")
    @ResponseBody
    public Tarea createTarea(@RequestBody Tarea tarea){
        Tarea newTarea = tareaRepository.createTarea(tarea);
        return newTarea;
    }

    /**
     * @return {@value} cantidad de tareas
     */
    @GetMapping("/count")
    public String countTarea(){
        int total = tareaRepository.countTareas();
        return String.format("Se tienen %s tareas.", total);
    }

    /**
     * @param id id de tarea
     * @return void
     */
    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE)
    public void deleteTarea(@PathVariable long id) {
        tareaRepository.deleteTareaById(id);
    }

    /**
     * @param id id de tarea
     * @return void
     */
    @RequestMapping(value = "/updateById/{id}", method = RequestMethod.PUT)
    public void updateTarea(@RequestBody Tarea tarea) {
        tareaRepository.updateTarea(tarea);
    }

    /**
     * @param id id de tarea
     * @return {@value} <List>Tarea tarea
     */
    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public List<Tarea> getTareaById(@PathVariable long id) {
        return tareaRepository.showTareaById(id);
    }

    /**
     * @param id id de la emergencia
     * @return {@value} <List>Tarea tarea
     */
    @RequestMapping(value = "/getTareaByIdEmergencia/{id}",method = RequestMethod.GET)
    public List<Tarea> getTareaByIdEmergencia(@PathVariable long id){
        return tareaRepository.getTareaByIdEmergencia(id);
    }


}
