package com.step.day8.genericClasses;

public class Main {
    public static void main(String[] args) {
        CricketTeam india = new CricketTeam("India", 10, 0, 0);
        CricketTeam australia = new CricketTeam("Australia", 9, 0, 0);
        LeagueTable<CricketTeam> cricketTeamLeagueTable = new LeagueTable<CricketTeam>();
        cricketTeamLeagueTable.addTeam(australia);
        cricketTeamLeagueTable.addTeam(india);
        cricketTeamLeagueTable.printTeams();

        System.out.println("------------------------");

        FootBallTeam russia = new FootBallTeam("Russia",1,2,0);
        FootBallTeam melbourne = new FootBallTeam("Melbourne",2,3,0);
        LeagueTable<FootBallTeam> footBallTeamLeagueTable = new LeagueTable<FootBallTeam>();
        footBallTeamLeagueTable.addTeam(russia);
        footBallTeamLeagueTable.addTeam(melbourne);
        footBallTeamLeagueTable.printTeams();

    }
}
