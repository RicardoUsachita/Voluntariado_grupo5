package tbd.lab.voluntariado.Services;

import org.springframework.web.bind.annotation.*;
import tbd.lab.voluntariado.Models.Ranking;
import tbd.lab.voluntariado.Repositories.RankingRepository;

import java.util.List;

@RestController
@RequestMapping("/ranking")
public class RankingService {
    private final RankingRepository rankingRepository;

    /**
     * @param rankingRepository
     */
    RankingService(RankingRepository rankingRepository) {
        this.rankingRepository = rankingRepository;
    }

    /**
     * @return {@value} List<Ranking> lista de rankings
     */
    @GetMapping
    public List<Ranking> getAll() {
        return rankingRepository.getAll();
    }

    /**
     * @return {@value} cantidad de rankings
     */
    @GetMapping("/count")
    public String countRanking(){
        int total = rankingRepository.countAllRanks();
        return String.format("Se tienen %s rankings.", total);
    }

    /**
     * @param ranking ranking a crear
     * @return {@value} Ranking ranking
     */
    @PostMapping("/create")
    @ResponseBody
    public Ranking createRanking(@RequestBody Ranking ranking){
        Ranking newRanking = rankingRepository.createRanking(ranking);
        return newRanking;
    }

    /**
     * @param id id de ranking
     * @return void
     */
    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE)
    public void deleteRanking(@PathVariable long id) {
        rankingRepository.deleteRankingById(id);
    }

    /**
     * @param ranking ranking a actualizar
     * @return void
     */
    @RequestMapping(value = "/updateById/{id}", method = RequestMethod.PUT)
    public void updateRanking(@RequestBody Ranking ranking) {
        rankingRepository.updateRanking(ranking);
    }

    /**
     * @param id id de ranking
     * @return {@value} <List>Ranking ranking
     */
    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public List<Ranking> getRankingById(@PathVariable long id) {
        return rankingRepository.showRankingById(id);
    }

    //COMPLEMENTARIO

    /**
     * @param id id de tarea
     * @return {@value} <List>Ranking ranking
     */
    @PostMapping("/createRankingByIdTarea/{id}")
    public List<Ranking> createRankingByIdTarea(@PathVariable long id) {
        List<Ranking> newRanking = rankingRepository.createRankingByIdTarea(id);
        return newRanking;
    }

    /**
     * @param id id de voluntario
     * @return {@value} <List>Ranking ranking
     */
    @PostMapping("/createRankingByIdVoluntario/{id}")
    public List<Ranking> createRankingByIdVoluntario(@PathVariable long id) {
        List<Ranking> newRanking = rankingRepository.createRankingByIdVoluntario(id);
        return newRanking;
    }

}
