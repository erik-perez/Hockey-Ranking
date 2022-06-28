package com.example.Hockey.Ranking.services;
import com.example.Hockey.Ranking.hockeyPlayer.HockeyPlayer;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


@RestController
public class PlayerDataService {

    private static List<HockeyPlayer> allStats = new ArrayList<>();

    public static List<HockeyPlayer> getAllStats() {
        return allStats;
    }

    @PostConstruct
    public static List <HockeyPlayer>  fetchPlayer(String fileInput) throws IOException {
        List<HockeyPlayer> newStats = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileInput));
        String currentLine;

        while ((currentLine = br.readLine()) != null){
            String[] detailed = currentLine.split(",");
            if(detailed[0].contains("Name")){
                continue;
            }

            String Name = detailed[0];
            String Team = detailed[1];
            double Age = Double.parseDouble(detailed[2]);
            String Pos = detailed[3];
            double GP = Double.parseDouble(detailed[4]);
            double G = Double.parseDouble(detailed[5]);
            double A = Double.parseDouble(detailed[6]);
            double PPP = Double.parseDouble(detailed[7]);
            double P = Double.parseDouble(detailed[8]);
            double PIM = Double.parseDouble(detailed[9]);
            double PlusMinus = Double.parseDouble(detailed[10]);
            String TOI = detailed[11];
            String ES = detailed[12];
            String PP = detailed[13];
            String SH = detailed[14];
            double GPer60 = Double.parseDouble(detailed[15]);
            double APer60 = Double.parseDouble(detailed[16]);
            double PPer60 = Double.parseDouble(detailed[17]);
            double ESGPer60 = Double.parseDouble(detailed[18]);
            double ESAPer60 = Double.parseDouble(detailed[19]);
            double ESPPer60 = Double.parseDouble(detailed[20]);
            double PPGPer60 = Double.parseDouble(detailed[21]);
            double PPAPer60 = Double.parseDouble(detailed[22]);
            double PPPPer60 = Double.parseDouble(detailed[23]);
            double GPerGP = Double.parseDouble(detailed[24]);
            double APerGP = Double.parseDouble(detailed[25]);
            double PPerGP = Double.parseDouble(detailed[26]);
            double SHOTS = Double.parseDouble(detailed[27]);
            double SHPercentage = Double.parseDouble(detailed[28]);
            double HITS = Double.parseDouble(detailed[29]);
            double BS = Double.parseDouble(detailed[30]);
            double rank = 0;

            newStats.add(new HockeyPlayer(Name, Team, Age, Pos, GP, G, A, PPP, P, PIM, PlusMinus, TOI,
                    ES, PP, SH, GPer60, APer60, PPerGP, ESGPer60, ESAPer60, ESPPer60, PPGPer60, PPAPer60,
                    PPPPer60, GPerGP, APerGP,  PPerGP, SHOTS, SHPercentage, HITS, BS, rank));
        }

        return newStats;
        }



    }

