package br.com.game.simulator.data;

import java.util.List;

import br.com.game.simulator.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesAPI {
    @GET("matches.json")
    Call<List<Match>> getMatches();
}
