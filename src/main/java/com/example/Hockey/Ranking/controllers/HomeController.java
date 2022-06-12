package com.example.Hockey.Ranking.controllers;

import com.example.Hockey.Ranking.hockeyPlayer.HockeyPlayer;
import com.example.Hockey.Ranking.services.PlayerDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    PlayerDataService playerDataService;

    @GetMapping("/")
    public String home(Model model){
        List<HockeyPlayer> allStats = PlayerDataService.getAllStats();
        String Name = String.valueOf(allStats.stream().mapToInt(stat -> Integer.parseInt(stat.getName())));
        String Teams  = String.valueOf(allStats.stream().mapToInt(stat -> Integer.parseInt(stat.getTeam())));
        double Age = allStats.stream().mapToInt(stat -> (int) stat.getAge()).sum();
        String Pos  = String.valueOf(allStats.stream().mapToInt(stat -> Integer.parseInt(stat.getPos())));
        double G = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();

        double A = allStats.stream().mapToInt(stat -> (int) stat.getA()).sum();
        double PPP = allStats.stream().mapToInt(stat -> (int) stat.getPPP()).sum();
        double P = allStats.stream().mapToInt(stat -> (int) stat.getP()).sum();
        double PIM = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double PlusMinus = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double TOI = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double ES = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double PP = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double SH = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double GPer60 = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double APer60 = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double PPer60 = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double ESGPer60 = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double ESAPer60 = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double ESPPer60 = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double PPGPer60 = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double PPAPer60 = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double PPPPer60 = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double GPerGP = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double APerGP = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double PPerGP = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double SHOTS = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double SHPercentage = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double HITS = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double BS = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();
        double rank = allStats.stream().mapToInt(stat -> (int) stat.getG()).sum();


        model.addAttribute("locationStats", allStats);
        model.addAttribute("Name", Name);
        model.addAttribute("Teams", Teams);
        model.addAttribute("Age", Age);
        model.addAttribute("Pos", Pos);
        model.addAttribute("G", G);
        model.addAttribute("A", A);
        model.addAttribute("PPP", PPP);
        model.addAttribute("P", P);
        model.addAttribute("PIM", PIM);
        model.addAttribute("PlusMinus", PlusMinus);
        model.addAttribute("TOI", TOI);
        model.addAttribute("ES", ES);
        model.addAttribute("PP", PP);
        model.addAttribute("SH", SH);
        model.addAttribute("GPer60", GPer60);
        model.addAttribute("APer60", APer60);
        model.addAttribute("PPer60", PPer60);
        model.addAttribute("ESGPer60", ESGPer60);
        model.addAttribute("ESAPer60", ESAPer60);
        model.addAttribute("ESPPer60", ESPPer60);
        model.addAttribute("PPGPer60", PPGPer60);
        model.addAttribute("PPAPer60", PPAPer60);
        model.addAttribute("PPPPer60", PPPPer60);
        model.addAttribute("GPerGP", GPerGP);
        model.addAttribute("APerGP", APerGP);
        model.addAttribute("PPerGP", PPerGP);
        model.addAttribute("SHOTS", SHOTS);
        model.addAttribute("SHPercentage", SHPercentage);
        model.addAttribute("HITS", HITS);
        model.addAttribute("BS", BS);
        model.addAttribute("rank", rank);

        return "home";

    }
}
