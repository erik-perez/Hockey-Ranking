package com.example.Hockey.Ranking.hockeyPlayer;
import lombok.Data;

import java.util.List;

@Data
public class HockeyPlayer {

    enum Position {
        RW, LW, C, D
    }

    String Name;
    String Team;
    double Age;
    Position Pos;
    double GP;
    double G;
    double A;
    double PPP;
    double P;
    double PIM;
    double PlusMinus;
    String TOI;
    String ES;
    String PP;
    String SH;
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

    public HockeyPlayer(String name, String team, double age, String pos, double GP, double g, double a, double PPP, double p,
                        double PIM, double plusMinus, String TOI, String ES, String PP, String SH, double GPer60, double APer60,
                        double PPer60, double ESGPer60, double ESAPer60, double ESPPer60, double PPGPer60, double PPAPer60,
                        double PPPPer60, double GPerGP, double APerGP, double PPerGP, double SHOTS, double SHPercentage, double HITS,
                        double BS, double rank) {
        Name = name;
        Team = team;
        Age = age;
        Pos = Position.valueOf(pos);
        this.GP = GP;
        G = g;
        A = a;
        this.PPP = PPP;
        P = p;
        this.PIM = PIM;
        PlusMinus = plusMinus;
        this.TOI = TOI;
        this.ES = ES;
        this.PP = PP;
        this.SH = SH;
        this.GPer60 = GPer60;
        this.APer60 = APer60;
        this.PPer60 = PPer60;
        this.ESGPer60 = ESGPer60;
        this.ESAPer60 = ESAPer60;
        this.ESPPer60 = ESPPer60;
        this.PPGPer60 = PPGPer60;
        this.PPAPer60 = PPAPer60;
        this.PPPPer60 = PPPPer60;
        this.GPerGP = GPerGP;
        this.APerGP = APerGP;
        this.PPerGP = PPerGP;
        this.SHOTS = SHOTS;
        this.SHPercentage = SHPercentage;
        this.HITS = HITS;
        this.BS = BS;
        this.rank = rank;
    }


    public HockeyPlayer(String averageName, String teamName, double avgAge, Position position, double games, double goals, double assists,
                        double ppp, double p, double pim, double plusMinus, String toi, String es, String pp, String sh,
                        double gper60, double aper60, double pper60, double esgper60, double esaper60, double espper60,
                        double ppgper60, double ppaper60, double pppper60, double GPerGP, double APerGP, double PPerGP,
                        double SHOTS, double SHPercentage, double HITS, double BS, double rank) {
    }


    public static HockeyPlayer createAvgPlayer(List <HockeyPlayer> NHL, Position position) {
        double avgGames = 0;
        double avgPer60Goals = 0;
        double avgPer60Assists = 0;
        double avgSog = 0;
        double avgPer60PPP = 0;
        double avgHits = 0;
        double avgBs = 0;

        String AverageName = "Average player";
        String teamName = "None";
        double AvgAge = 0;
        Position AvgPos = position;
        double AvgGP = 0;
        double AvgG = 0;
        double AvgA = 0;
        double AvgPPP = 0;
        double AvgP = 0;
        double AvgPIM = 0;
        double AvgPlusMinus = 0;
        String AvgTOI = "Fill";
        String AvgES = "FIll";
        String AvgPP = "Fill";
        String AvgSH = "Fill";
        double AvgGPer60 = 0;
        double AvgAPer60 = 0;
        double AvgPPer60 = 0;
        double AvgESGPer60 = 0;
        double AvgESAPer60 = 0;
        double AvgESPPer60 = 0;
        double AvgPPGPer60 = 0;
        double AvgPPAPer60 = 0;
        double AvgPPPPer60 = 0;
        double AvgGPerGP = 0;
        double AvgAPerGP = 0;
        double AvgPPerGP = 0;
        double AvgSHOTS = 0;
        double AvgSHPercentage = 0;
        double AvgHITS = 0;
        double AvgBS = 0;
        double Avgrank = 0;
        int count = 0;


        for (HockeyPlayer b : NHL){
            count ++;

//            AverageName = "Average player";
//            teamName = "None";
            AvgAge = AvgAge + b.getAge();
//            AvgPos = position;
            AvgGP = AvgGP + b.getGP();
            AvgG = AvgG + b.getG();
            AvgA = AvgA + b.getA();
            AvgPPP = AvgPPP + b.getPPP();
            AvgP = AvgP + b.getP();
            AvgPIM = AvgPIM + b.getPIM();
            AvgPlusMinus = AvgPlusMinus + b.getPlusMinus();
//            AvgTOI = "Fill";
//            AvgES = "FIll";
//            AvgPP = "Fill";
//            AvgSH = "Fill";
            AvgGPer60 = AvgGPer60 + b.getGPer60();
            AvgAPer60 = AvgAPer60 + b.getAPer60();
            AvgPPer60 = AvgPPer60 + b.getPPer60();
            AvgESGPer60 = AvgESGPer60 + b.getESGPer60();
            AvgESAPer60 = AvgESAPer60 + b.getESAPer60();
            AvgESPPer60 = AvgESPPer60 + b.getESPPer60();
            AvgPPGPer60 = AvgPPGPer60 + b.getPPGPer60();
            AvgPPAPer60 = AvgPPAPer60 + b.getPPAPer60();
            AvgPPPPer60 = AvgPPPPer60 + b.getPPPPer60();
            AvgGPerGP = AvgGPerGP + b.getGPerGP();
            AvgAPerGP = AvgAPerGP + b.getAPer60();
            AvgPPerGP = AvgPPerGP + b.getPPerGP();
            AvgSHOTS = AvgSHOTS + b.getSHOTS();
            AvgSHPercentage = AvgSHPercentage + b.getSHPercentage();
            AvgHITS = AvgHITS + b.getHITS();
            AvgBS = AvgBS + b.getBS();
//            Avgrank = 0;


        }

        AverageName = "Average player";
        teamName = "None";
        AvgAge = AvgAge/count;
        AvgPos = position;
        AvgGP = AvgGP/count;
        AvgG = AvgG/count;
        AvgA = AvgA/count;
        AvgPPP = AvgPPP/count;
        AvgP = AvgP/count;
        AvgPIM = AvgPIM/count;
        AvgPlusMinus = AvgPlusMinus/count;
        AvgTOI = "Fill";
        AvgES = "FIll";
        AvgPP = "Fill";
        AvgSH = "Fill";
        AvgGPer60 = AvgGPer60/count;
        AvgAPer60 = AvgAPer60/count;
        AvgPPer60 = AvgPPer60/count;
        AvgESGPer60 = AvgESGPer60/count;
        AvgESAPer60 = AvgESAPer60/count;
        AvgESPPer60 = AvgESPPer60/count;
        AvgPPGPer60 = AvgPPGPer60/count;
        AvgPPAPer60 = AvgPPAPer60/count;
        AvgPPPPer60 = AvgPPPPer60/count;
        AvgGPerGP = AvgGPerGP/count;
        AvgAPerGP = AvgAPerGP/count;
        AvgPPerGP = AvgPPerGP/count;
        AvgSHOTS = AvgSHOTS /count;
        AvgSHPercentage = AvgSHPercentage/count;
        AvgHITS = AvgHITS /count;
        AvgBS = AvgBS/count;
        Avgrank = 0;


        return new HockeyPlayer(AverageName, teamName, AvgAge, AvgPos, AvgGP, AvgG, AvgA, AvgPPP, AvgP, AvgPIM, AvgPlusMinus,
                AvgTOI, AvgES, AvgPP, AvgSH, AvgGPer60, AvgAPer60, AvgPPer60, AvgESGPer60, AvgESAPer60, AvgESPPer60, AvgPPGPer60,
                AvgPPAPer60, AvgPPPPer60, AvgGPerGP, AvgAPerGP, AvgPPerGP, AvgSHOTS, AvgSHPercentage, AvgHITS, AvgBS, Avgrank);
    }

    public HockeyPlayer setAverage(){
        setG(getG()/getGP());
        setA(getA()/getGP());
        setPPP(getPPP()/getGP());
        setP(getP()/getGP());
        setPIM(getPIM()/getGP());
        setPlusMinus(getPlusMinus()/getGP());
        setGPer60(getGPer60()/getGP());
        setAPer60(getAPer60()/getGP());
        setPPer60(getPPer60()/getGP());
        setESGPer60(getESGPer60()/getGP());
        setESAPer60(getESAPer60()/getGP());
        setESPPer60(getESPPer60()/getGP());
        setPPGPer60(getPPGPer60()/getGP());
        setPPAPer60(getPPAPer60()/getGP());
        setPPPPer60(getPPPPer60()/getGP());
        setGPerGP(getGPerGP()/getGP());
        setAPerGP(getAPerGP()/getGP());
        setPPerGP(getPPerGP()/getGP());
        setSHOTS(getSHOTS()/getGP());
        setHITS(getHITS()/getGP());
        setBS(getBS()/getGP());
        return null;
    }

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

