package com.example.Hockey.Ranking;


import com.example.Hockey.Ranking.hockeyPlayer.HockeyPlayer;
import com.example.Hockey.Ranking.hockeyPlayer.Ranking;
import com.example.Hockey.Ranking.services.PlayerDataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;


@SpringBootApplication
public class HockeyRankingApplication {

	public static void main(String[] args) throws IOException {
		String HockeyPlayerCsv2020 = "/Users/erik/JavaProjects/Hockey-Ranking/NHL 2020 Player Stats.csv";
		List<HockeyPlayer> nhlS2020 = PlayerDataService.fetchPlayer(HockeyPlayerCsv2020);
		Ranking.assignRanks(nhlS2020);
		nhlS2020.stream().sorted((o1, o2) -> Double.compare(o2.getRank(), o1.getRank()))
				.forEach(h -> System.out.println(h.toString()));

		SpringApplication.run(HockeyRankingApplication.class, args);



	}

}
