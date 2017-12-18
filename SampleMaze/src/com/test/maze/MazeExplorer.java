package com.test.maze;

import java.awt.Point;
import java.util.List;
import java.util.Scanner;

public class MazeExplorer {
	protected final Scanner inputSC=new Scanner(System.in);
	protected void start() {
        System.out.println("\nMaze explorer started, type 'quit' to quit game, 'menu' to go back to main menu\n");
        MazeBuilder mazeBuilder = new MazeBuilder();
        char[][] mazeGrid = mazeBuilder.build();
        Point point = MazeMovement.getDefaultPoint(mazeGrid);

        KeyExplorer explorer = new KeyExplorer(mazeGrid, point);

        while (true) {
            System.out.println("\nSelect your next movement, 'u':Up, 'd':Down, 'l':Left, 'r':Right (example: u)");
            String input = inputSC.next();
            checkMenu(input, explorer.getMovementHistoryList());
            switch (input) {
                case "u":
                    new Up(explorer).move();
                    break;

                case "d":
                    new Down(explorer).move();
                    break;

                case "l":
                    new Left(explorer).move();
                    break;

                case "r":
                    new Right(explorer).move();
                    break;

                default:
                   System.out.println("ALERT: Wrong input. Option available: [u] [d] [l] [r]");
            }
        }
        }
        private void checkMenu(String input,List<String> historyList) {
	        switch (input) {
	            case "menu":
	            	MazeMenu menu=new MazeMenu();
	                menu.showMainMenu();

	            case "quit":
	               System.out.println("\nQuit Maze\n");
	               if (historyList != null) {
	            	   System.out.println("Sumarry of your route: \n");
	                   for (String route : historyList) {
	                       System.out.println(route);
	                }
	                inputSC.close();
	                System.exit(0);
	        }
	    }
    }

}
