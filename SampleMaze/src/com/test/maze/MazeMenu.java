package com.test.maze;

import java.util.Scanner;

public class MazeMenu {

	   protected final Scanner inputSC=new Scanner(System.in);
	   protected void showMainMenu() {
		   System.out.println("\nChoose game (1 or 2): ");
		   System.out.println("1: Maze coordinate");
		   System.out.println("2: Maze explorer");
		   System.out.println("\n I want to play :");
		   String input=this.inputSC.next();
		   selectMenu(input);
		   
	   }
	   
	   protected void selectMenu(String input) {
	        switch (input) {
	            case "1":
	                System.out.println("\nMaze started, type 'quit' to quit game, 'menu' to go back main menu\n");
	                new MazeCoordinate().start();
	                break;

	            case "2":
	                new MazeExplorer().start();
	                break;

	            default:
	              System.out.println("Menu option available: 1, 2");
	        }
	    }
	
	
}


