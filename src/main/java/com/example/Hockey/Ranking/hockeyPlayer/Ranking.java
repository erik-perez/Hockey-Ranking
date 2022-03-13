package com.example.Hockey.Ranking.hockeyPlayer;

import java.util.List;
import java.util.stream.Collectors;

public class Ranking {
    public static void assignRanks(List<HockeyPlayer> toBeRanked) {
        for (HockeyPlayer.Position pos : HockeyPlayer.Position.values()) {
            assignRank(toBeRanked, pos);
        }
    }

    private static void assignRank(List<HockeyPlayer> toBeRanked, HockeyPlayer.Position position) {
        List<HockeyPlayer> filtered =
                toBeRanked.stream().filter(p -> p.getPosition().equals(position)).collect(Collectors.toList());

        HockeyPlayer average = HockeyPlayer.createAvgPlayer(filtered, position);
        for (HockeyPlayer b : filtered){
            assignRank(b, average);
        }
    }

    private static void assignRank(HockeyPlayer toBeRanked, HockeyPlayer average) {
        double rk = ((toBeRanked.getGoals() - average.getGoals()) + (toBeRanked.getAssists() - average.getAssists()) + (toBeRanked.getSog() - average.getSog()) +
                (toBeRanked.getPpp() - average.getPpp()) + (toBeRanked.getHits() - average.getHits()) + (toBeRanked.getBs() - average.getBs()));
        toBeRanked.setRank(rk);
    }
}
