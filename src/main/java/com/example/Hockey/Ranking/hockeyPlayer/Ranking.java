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
                toBeRanked.stream().filter(p -> p.getPos().equals(position)).collect(Collectors.toList());

        HockeyPlayer average = HockeyPlayer.createAvgPlayer(filtered, position);
        for (HockeyPlayer b : filtered){
            assignRank(b, average);
        }
    }

    private static void assignRank(HockeyPlayer toBeRanked, HockeyPlayer average) {
        double rk = ((toBeRanked.getGPer60() - average.getGPer60()) + (toBeRanked.getAPer60() - average.getAPer60())
                + (toBeRanked.getSHOTS() - average.getSHOTS()) + (toBeRanked.getPPPPer60() - average.getPPPPer60()) +
                (toBeRanked.getHITS() - average.getHITS()) + (toBeRanked.getBS() - average.getBS()));
        toBeRanked.setRank(rk);
    }
}
