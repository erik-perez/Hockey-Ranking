package com.example.Hockey.Ranking.services;

import com.example.Hockey.Ranking.hockeyPlayer.HockeyPlayer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;



@RestController
public class PlayerDataService {

    private static String HockeyPlayerCsv2020 = "https://github.com/erik-perez/Hockey-Ranking/blob/master/NHL%202020%20Player%20Stats.csv";

    private static List<HockeyPlayer> allStats = new ArrayList<>();

    public static List<HockeyPlayer> getAllStats() {
        return allStats;
    }

    @PostConstruct
    @Scheduled(cron = "* * 1 * * *")
    public void fetchVirusData() throws IOException, InterruptedException {

        List<HockeyPlayer> newStats = new ArrayList<>();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(HockeyPlayerCsv2020))
                .build();
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        StringReader csvBodyReader = new StringReader(httpResponse.body());
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvBodyReader);






               for (CSVRecord record : records) {
                HockeyPlayer playerStat = new HockeyPlayer();
                playerStat.setName(record.get("Name"));
                playerStat.setTeam((record.get("Team")));
                playerStat.setAge(Double.parseDouble(record.get("Age")));
                playerStat.setPos((record.get("Pos")));
                playerStat.setGP(Double.parseDouble(record.get("GP")));
                playerStat.setG(Double.parseDouble(record.get("G")));
                playerStat.setA(Double.parseDouble(record.get("A")));
                playerStat.setPPP(Double.parseDouble(record.get("PPP")));
                playerStat.setP(Double.parseDouble(record.get("P")));
                playerStat.setPIM(Double.parseDouble(record.get("PIM")));
                playerStat.setPlusMinus(Double.parseDouble(record.get("+/-")));
                playerStat.setTOI(Double.parseDouble(record.get("TOI")));
                playerStat.setES(Double.parseDouble(record.get("ES")));
                playerStat.setPP(Double.parseDouble(record.get("PP")));
                playerStat.setSH(Double.parseDouble(record.get("SH")));
                playerStat.setGPer60(Double.parseDouble(record.get("G/60")));
                playerStat.setAPer60(Double.parseDouble(record.get("A/60")));
                playerStat.setPPAPer60(Double.parseDouble(record.get("P/60")));
                playerStat.setESGPer60(Double.parseDouble(record.get("ESG/60")));
                playerStat.setESAPer60(Double.parseDouble(record.get("ESA/60")));
                playerStat.setESPPer60(Double.parseDouble(record.get("ESP/60")));
                playerStat.setPPGPer60(Double.parseDouble(record.get("PPG/60")));
                playerStat.setPPAPer60(Double.parseDouble(record.get("PPA/60")));
                playerStat.setPPPPer60(Double.parseDouble(record.get("PPP/60")));
                playerStat.setGPerGP(Double.parseDouble(record.get("G/GP")));
                playerStat.setAPerGP(Double.parseDouble(record.get("A/GP")));
                playerStat.setPPerGP(Double.parseDouble(record.get("P/GP")));
                playerStat.setSHOTS(Double.parseDouble(record.get("SHOTS")));
                playerStat.setSHPercentage(Double.parseDouble(record.get("SH%")));
                playerStat.setHITS(Double.parseDouble(record.get("HITS")));
                playerStat.setBS(Double.parseDouble(record.get("BS")));
                playerStat.setRank(0);
                newStats.add(playerStat);
            }
            this.allStats = newStats;
    }


        //   List<HockeyPlayer> ranking = FileInput.readNHLplayers(HockeyPlayerCsv2020);


//    @RequestMapping("/")
//    public List<HockeyPlayer> buildRank(Model model){
//        assignRanks(ranking);
//        ranking.stream().sorted((o1, o2) -> Double.compare(o2.getRank(), o1.getRank()));
//        model.addAttribute("HockeyPlayer", ranking);
//        return ranking;
//    }

}
