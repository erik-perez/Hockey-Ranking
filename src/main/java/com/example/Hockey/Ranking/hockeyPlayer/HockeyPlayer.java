package com.example.Hockey.Ranking.hockeyPlayer;
import lombok.Data;

@Data
public class HockeyPlayer {


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
    String SHPercentage;
    double HITS;
    double BS;
    double rank;

    public HockeyPlayer(String name, String team, double age, String pos, double GP, double g, double a, double PPP, double p, double PIM, double plusMinus, String TOI, String ES,
                        String PP, String SH, double GPer60, double APer60, double PPer60, double ESGPer60, double ESAPer60, double ESPPer60, double PPGPer60, double PPAPer60,
                        double PPPPer60, double GPerGP, double APerGP, double PPerGP, double SHOTS, String SHPercentage, double HITS, double BS, double rank) {
        Name = name;
        Team = team;
        Age = age;
        Pos = pos;
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

