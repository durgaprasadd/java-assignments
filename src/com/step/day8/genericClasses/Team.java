package com.step.day8.genericClasses;

public abstract class Team<T extends Team> {
    private String name;
    protected int matchesWon;
    protected int matchesLost;
    protected int matchesDraw;
    public Team(String name, int matchesWon, int matchesLost, int matchesDraw) {
        this.name = name;
        this.matchesWon = matchesWon;
        this.matchesLost = matchesLost;
        this.matchesDraw = matchesDraw;
    }

    public String getName() {
        return name;
    }

    public int compareToOtherTeam(T team){
        return this.calculateTotalPoints() - team.calculateTotalPoints();
    }

    protected abstract int calculateTotalPoints();
}
