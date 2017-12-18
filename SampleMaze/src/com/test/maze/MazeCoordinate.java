package com.test.maze;

import java.awt.Point;
import java.util.Scanner;

public class MazeCoordinate {
	protected final Scanner inputSC=new Scanner(System.in);
	protected void start() {
        MazeBuilder mazeBuilder = new MazeBuilder();
        char[][] mazeGrid = mazeBuilder.build();
        mazeBuilder.printInfo();
        System.out.println("\nEnter coordinate (example: x,y): ");
        String input = inputSC.next();
       checkMenu(input);
        Point point = MazeMovement.getPointFromInput(input, mazeGrid);
        if (point.x >= 0) {
            char currentGrid = mazeGrid[point.x][point.y];
            switch (currentGrid) {
                case 'S':
                    System.out.println("Character in maze grid: [START POINT 'S']\n");
                    break;
                case 'F':
                	System.out.println("Character in maze grid: [EXIT POINT 'F']\n");
                    break;
                default:
                	System.out.println("Character in maze grid: [" + mazeGrid[point.x][point.y] + "]\n");

}
        }
        else {
        	System.out.println("\nEnter valid coordinate (example: x,y): ");
            
        }
	}
	 private void checkMenu(String input) {
	        switch (input) {
	            case "menu":
	            	MazeMenu menu=new MazeMenu();
	                menu.showMainMenu();

	            case "quit":
	               System.out.println("\nQuit Maze\n");
	                inputSC.close();
	                System.exit(0);
	        }
	    }
}

