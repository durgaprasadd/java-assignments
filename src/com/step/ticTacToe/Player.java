package com.step.ticTacToe;

import java.util.ArrayList;

public class Player {
    private String name;
    private String symbol;
    private ArrayList<Integer> moves = new ArrayList<Integer>();

    public Player(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public void printTurn(){
        System.out.println(this.name+"'s Turn");
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }
    public void addMove(int position){
        moves.add(position);
    }

    public ArrayList<Integer> getMoves() {
        return moves;
    }
}
