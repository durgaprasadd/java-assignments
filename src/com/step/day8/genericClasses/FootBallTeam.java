package com.step.day8.genericClasses;

public class FootBallTeam extends Team{
    public FootBallTeam(String name, int matchesWon, int matchesLost, int matchesDraw) {
        super(name, matchesWon, matchesLost, matchesDraw);
    }
    public int calculateTotalPoints(){
        return this.matchesWon + this.matchesLost*-2;
    }
}
