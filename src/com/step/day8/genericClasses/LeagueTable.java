package com.step.day8.genericClasses;

import java.util.ArrayList;
import java.util.Comparator;

public class LeagueTable<T extends Team> {
    private ArrayList<T>teams = new ArrayList<T>();

    public void addTeam(T team){
        this.teams.add(team);
    }

    private void sortList(){
        teams.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o2.compareToOtherTeam(o1);
            }
        });
    }

    public void printTeams(){
     sortList();
        for (int i = 0; i < this.teams.size(); i++) {
            System.out.println(this.teams.get(i).getName());
        }
    }
}
