package tbd.lab.voluntariado.Services;

import org.springframework.web.bind.annotation.*;
import tbd.lab.voluntariado.Models.Institucion;
import tbd.lab.voluntariado.Repositories.InstitucionRepository;

import java.util.List;

@RestController
@RequestMapping("/institucion")
public class InstitucionService {
    private final InstitucionRepository institucionRepository;

    /**
     * @param institucionRepository
     */
    InstitucionService(InstitucionRepository institucionRepository){
        this.institucionRepository = institucionRepository;
    }

    /**
     * @return {@value} List<Institucion> lista de instituciones
     */
    @GetMapping
    public List<Institucion> getAllInstitucions(){
        System.out.println(institucionRepository.getAll());
        return institucionRepository.getAll();
    }

    /**
     * @param id id de institucion
     * @return {@value} Institucion institucion
     */
    @GetMapping("/getById/{id}")
    public List<Institucion> getInstitucionById(@PathVariable long id){
        return institucionRepository.showInstitucionById(id);
    }

    /**
     * @return String cantidad de instituciones
     */
    @GetMapping("/count")
    public String countInstitucion(){
        int total = institucionRepository.countInstituciones();
        return String.format("Se tienen %s instituciones.", total);
    }

    /**
     * @param institucion
     * @return {@value} Institucion institucion
     */
    @PostMapping("/create")
    @ResponseBody
    public Institucion createInstitucion(@RequestBody Institucion institucion){
        Institucion newInstitucion = institucionRepository.createInstitucion(institucion);
        return newInstitucion;
    }

    /**
     * @param id id de institucion
     * @return {@value} Institucion institucion
     */
    @RequestMapping(value = "/deleteById/{id}", produces = "application/json", method = {RequestMethod.GET, RequestMethod.DELETE})
    public void deleteInstitucion(@PathVariable long id){
        institucionRepository.deleteInstitucionById(id);
    }

    /**
     * @param institucion
     * @return {@value} Institucion institucion
     */
    @RequestMapping(value = "/updateById/{id}", produces = "application/json", method = {RequestMethod.PUT})
    public void updateInstitucion(@RequestBody Institucion institucion){
        institucionRepository.updateInstitucion(institucion);
    }


}
