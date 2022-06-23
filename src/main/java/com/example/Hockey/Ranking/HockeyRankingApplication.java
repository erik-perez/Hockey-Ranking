package com.example.Hockey.Ranking;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HockeyRankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HockeyRankingApplication.class, args);




//
//		String players = "./NHL 2020 Player Stats.csv";
//		List<HockeyPlayer> nhlS2021 = FileInput.readNHLplayers(players);
//
//		assignRanks(nhlS2021)
//
//		System.out.println("name,\t team, position, games, goals,\t\t\t\t assists,\t\t\t Sog,\t\t\t\t PPP,\t\t\t\t Hits,\t\t\t\t BS, \t\t\t\t Rank");
//		nhlS2021.stream().sorted((o1, o2) -> Double.compare(o2.getRank(), o1.getRank()))
//				.forEach(h -> System.out.println(h.printPlayer()));
	}

}
