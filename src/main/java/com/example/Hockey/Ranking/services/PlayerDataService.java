package com.example.Hockey.Ranking.services;

import com.example.Hockey.Ranking.hockeyPlayer.HockeyPlayer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.List;



@RestController
public class PlayerDataService {

    private static String HockeyPlayerCsv2020 = "/Users/erik/JavaProjects/Hockey-Ranking/NHL 2020 Player Stats.csv";

    private static List<HockeyPlayer> allStats = new ArrayList<>();

    public static List<HockeyPlayer> getAllStats() {
        return allStats;
    }

    @RequestMapping("/")
    @PostConstruct
    public void fetchVirusData() throws IOException {
        List<CSVRecord> newStats = new ArrayList<>();
        HockeyPlayer playerStat = new HockeyPlayer();

        BufferedReader br = new BufferedReader(new FileReader(HockeyPlayerCsv2020));
        CSVParser parser = CSVFormat.DEFAULT.withDelimiter(',').withHeader().parse(br);
        {
            for (CSVRecord record : parser) {
                System.out.println(record.toString());
                newStats.add(record);
            }







//    @RequestMapping("/")
//    public List<HockeyPlayer> buildRank(Model model){
//        assignRanks(ranking);
//        ranking.stream().sorted((o1, o2) -> Double.compare(o2.getRank(), o1.getRank()));
//        model.addAttribute("HockeyPlayer", ranking);
//        return ranking;
//    }

        }
    }
}
