package com.example.Hockey.Ranking.hockeyPlayer;
import lombok.Data;
import java.util.List;

@Data
public class HockeyPlayer {

//    enum Position {
//        C, D, LW, RW;
//    }
//
//    public enum Teams {
//
//    }

    String Name;
    String Team;
    double Age;
    String Pos;
    double GP;
    double G;
    double A;
    double PPP;
    double P;
    double PIM;
    double PlusMinus;
    double TOI;
    double ES;
    double PP;
    double SH;
    double GPer60;
    double APer60;
    double PPer60;
    double ESGPer60;
    double ESAPer60;
    double ESPPer60;
    double PPGPer60;
    double PPAPer60;
    double PPPPer60;
    double GPerGP;
    double APerGP;
    double PPerGP;
    double SHOTS;
    double SHPercentage;
    double HITS;
    double BS;
    double rank;



//    public static HockeyPlayer createPlayer(String[] data) {
//        String name = data.;
//        String team = data[1];
//        Position position = Position.valueOf(data[2]);
//        int games = Integer.parseInt(data[3]);
//        double goals = Integer.parseInt(data[4]);
//        double assists = Integer.parseInt(data[5]);
//        double sog = Integer.parseInt(data[9]);
//        double ppp = Integer.parseInt(data[11]) + Integer.parseInt(data[12]);
//        double hits = Integer.parseInt(data[15]);
//        double bs = Integer.parseInt(data[16]);
//        double rk = 0;
//
//        return new HockeyPlayer(name, team, position, games, goals, assists, sog, ppp, hits, bs, rk);
//    }
//
//    public static HockeyPlayer createAvgPlayer(List<HockeyPlayer> NHL, Position position) {
//        double avgGames = 0;
//        double avgGoals = 0;
//        double avgAssists = 0;
//        double avgSog = 0;
//        double avgPPP = 0;
//        double avgHits = 0;
//        double avgBs = 0;
//        int count = 0;
//        for (HockeyPlayer b : NHL){
//            count ++;
//            avgGames = avgGames + b.getGames();
//            avgGoals = avgGoals + b.getGoals();
//            avgAssists = avgAssists+ b.getAssists();
//            avgSog = avgSog + b.getSog();
//            avgPPP = avgPPP + b.getPpp();
//            avgHits = avgHits + b.getHits();
//            avgBs = avgBs + b.getBs();
//        }
//        String AverageName = "Average player";
//        String teamName = "None";
//        double games = (avgGames/count);
//        double goals = (avgGoals/count);
//        double assists = (avgAssists/count);
//        double sog = (avgSog/count);
//        double ppp = (avgPPP/count);
//        double hits = (avgHits/count);
//        double bs = (avgBs/count);
//        double rk = 0;
//
//        return new HockeyPlayer(AverageName, teamName, position, games, goals, assists, sog, ppp, hits, bs, rk);
//    }
//
//    public HockeyPlayer(String name, String team, Position position, double games, double goals, double assists, double sog, double ppp, double hits, double bs, double rank) {
//        this.name = name;
//        this.team = team;
//        this.position = position;
//        this.games = games;
//        this.goals = goals;
//        this.assists = assists;
//        this.sog = sog;
//        this.ppp = ppp;
//        this.hits = hits;
//        this.bs = bs;
//        this. rank = rank;
//    }

    @Override
    public String toString() {
        return "HockeyPlayer{" +
                "Name='" + Name + '\'' +
                ", Team='" + Team + '\'' +
                ", Age=" + Age +
                ", Pos='" + Pos + '\'' +
                ", GP='" + GP + '\'' +
                ", G=" + G +
                ", A='" + A + '\'' +
                ", PPP='" + PPP + '\'' +
                ", P=" + P +
                ", PIM='" + PIM + '\'' +
                ", +/-='" + PlusMinus + '\'' +
                ", TOI=" + TOI +
                ", ES='" + ES + '\'' +
                ", PP='" + PP + '\'' +
                ", SH=" + SH +
                ", G/60='" + GPer60 + '\'' +
                ", A/60='" + APer60 + '\'' +
                ", P/60=" + PPer60 +
                ", ESG/60='" + ESGPer60 + '\'' +
                ", ESA/60='" + ESAPer60 + '\'' +
                ", ESP/60=" + ESPPer60 +
                ", PPG/60='" + PPGPer60 + '\'' +
                ", PPA/60='" + PPAPer60 + '\'' +
                ", PPP/60=" + PPPPer60 +
                ", G/GP='" + GPerGP + '\'' +
                ", A/GP='" + APerGP + '\'' +
                ", P/GP=" + PPerGP +
                ", SHOTS='" + SHOTS + '\'' +
                ", SH%='" + SHPercentage + '\'' +
                ", HITS=" + HITS +
                ", BS='" + BS + '\'' +
                ", rank='" + rank +
                '}';
    }
}

