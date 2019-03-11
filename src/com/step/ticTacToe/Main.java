package com.step.ticTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic Tac Toe :\n");

        Game game = initializeGame(scanner);
        game.printBoard();
        System.out.println("please enter your moves from 1 to 9");
        game.printCurrentPlayerTurn();
        int position = scanner.nextInt();

        while (true){
            game.addMove(position);
            if(game.hasWon){
                game.printWinner();
                break;
            }
            position = scanner.nextInt();
        }
    }
    public static boolean isValidSymbol(String symbol){
        if(symbol.equals("X") || symbol.equals("O")){
            return true;
        }
        return false;
    }

    public static String getPlayerName(Scanner scanner,int playerNumber){
        System.out.println("Please Enter Player" + playerNumber + " Name:");
        String name = scanner.next();
        return name;
    }

    public static String getPlayerSymbol(Scanner scanner){
        System.out.println("Please Enter Your symbol : ( X or O )");
        String symbol = scanner.next();
        while (!isValidSymbol(symbol)){
            System.out.println("Please Enter Valid Symbol");
            symbol = scanner.next();
        }
        return symbol;
    }
    public static String getRemainingSymbol(String symbol){
        if(symbol.equals("X")){
            return "O";
        }
        return "X";
    }
    public static Game initializeGame(Scanner scanner){
        String playerName1 = getPlayerName(scanner,1);
        String playerSymbol1 = getPlayerSymbol(scanner);
        String playerName2 = getPlayerName(scanner,2);
        String playerSymbol2 = getRemainingSymbol(playerSymbol1);
        Player player1 = new Player(playerName1, playerSymbol1);
        Player player2 = new Player(playerName2, playerSymbol2);
        Game game = new Game(new Player[]{player1, player2});
        return game;
    }
}
