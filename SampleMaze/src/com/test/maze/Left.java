package com.test.maze;

import java.awt.Point;

public class Left {
	
	 private final KeyExplorer explorer;

	    public Left(KeyExplorer keyExplorer) {
	        this.explorer = keyExplorer;
	    }

	    public void move() {
	        Point point = explorer.getCurrentPoint();
	        Movement mov=new Movement();
	        if (point.x - 1 >= 0) {
	            point.x--;
	            Point newPoint = new Point(point.x, point.y);
	            mov.updateExplorer(newPoint, explorer, KeyExplorer.MOVE.LEFT);          

	        } else {
	            System.out.println("You are at the most left of wall, not allow to move left");
	        }
	    }

}
