package com.step.ticTacToe;

import java.util.ArrayList;

public class Game {
    public boolean hasWon = false;
    private int[][] winningChances = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 5, 9}, {3, 5, 7}, {1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
    private Player[] players;

    public Game(Player[] players) {
        this.players = players;
    }

    public void addMove(int position) {
        if (isValidMove(position)) {
            players[0].addMove(position);
            printBoard();
            if (checkIsWon()) {
                hasWon = true;
                return;
            }
            changeTurn();
            printCurrentPlayerTurn();
            return;
        }
        System.out.println("Invalid Move");
        printCurrentPlayerTurn();
    }


    public boolean isValidMove(int position) {
        ArrayList<Integer> playerMoves1 = this.players[0].getMoves();
        ArrayList<Integer> playerMoves2 = this.players[1].getMoves();
        if (playerMoves1.contains(position) || playerMoves2.contains(position)) {
            return false;
        }
        return true;
    }

    public void printCurrentPlayerTurn() {
        System.out.println(this.players[0].getName() + "'s Turn");
    }

    public void changeTurn() {
        Player player = this.players[0];
        this.players[0] = this.players[1];
        this.players[1] = player;
    }

    public void printWinningChances() {
        System.out.println(this.winningChances[0][0]);
    }

    public void printBoard() {

        for (int i = 0; i <= 2; i++) {
            System.out.println("-------------");
            System.out.print("| ");
            for (int j = 1; j <= 3; j++) {
                String symbol = " ";
                Player player = this.players[0];
                if (player.getMoves().contains((i * 3) + j)) {
                    symbol = player.getSymbol();
                }
                player = this.players[1];
                if (player.getMoves().contains((i * 3) + j)) {
                    symbol = player.getSymbol();
                }
                System.out.print(symbol + " | ");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }

    public boolean checkIsWon() {
        ArrayList<Integer> playerMoves = this.players[0].getMoves();
        for (int i = 0; i < winningChances.length; i++) {
            boolean isWon = true;
            for (int j = 0; j < winningChances[i].length; j++) {
                if (!playerMoves.contains(winningChances[i][j])) {
                    isWon = false;
                    break;
                }
            }
            if (isWon) {
                return true;
            }
        }
        return false;
    }

    public void printWinner() {
        String winner = this.players[0].getName();
        System.out.println(winner + " has won");
    }
}
