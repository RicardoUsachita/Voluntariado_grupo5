package tbd.lab.voluntariado.repositories;

import tbd.lab.voluntariado.models.Ranking;

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
