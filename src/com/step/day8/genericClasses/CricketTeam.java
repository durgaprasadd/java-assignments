package com.step.day8.genericClasses;

public class CricketTeam extends Team{
    public CricketTeam(String name, int matchesWon, int matchesLost, int matchesDraw) {
        super(name, matchesWon, matchesLost, matchesDraw);
    }
    public int calculateTotalPoints(){
        return this.matchesWon*2 +this.matchesDraw;
    }
}
