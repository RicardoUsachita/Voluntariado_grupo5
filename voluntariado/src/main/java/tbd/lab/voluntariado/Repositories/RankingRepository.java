package tbd.lab.voluntariado.Repositories;

import tbd.lab.voluntariado.Models.Ranking;

import java.util.List;

public interface RankingRepository {
    Integer generateIdRanking();

    Ranking createRanking(Ranking ranking);

    Ranking getRankingById(Integer id);

    List<Ranking> getAllRankings();

    Ranking updateRanking(Ranking ranking);

    void deleteRankingById(Integer id);

    void deleteRanking();
}
