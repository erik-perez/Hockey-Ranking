package com.example.Hockey.Ranking.controller;

import com.example.Hockey.Ranking.fileInput.FileInput;
import com.example.Hockey.Ranking.hockeyPlayer.HockeyPlayer;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.Hockey.Ranking.hockeyPlayer.Ranking.assignRanks;

@RestController
public class PlayerDataService {

    private static String HockeyPlayerCsv = "./nhl-stats.csv";
    List<HockeyPlayer> ranking = FileInput.readNHLplayers(HockeyPlayerCsv);


    @RequestMapping("/")
    public List<HockeyPlayer> buildRank(Model model){
        assignRanks(ranking);
        ranking.stream().sorted((o1, o2) -> Double.compare(o2.getRank(), o1.getRank()));
        model.addAttribute("HockeyPlayer", ranking);
        return ranking;
    }

}
