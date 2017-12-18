package com.test.maze;

import java.awt.Point;

public class Movement {
	
	protected void updateExplorer(Point newPoint, KeyExplorer explorer, KeyExplorer.MOVE key) {
        explorer.addMovementHistory(key, newPoint);
        explorer.setCurrentPoint(newPoint);
        printCurrentCoordinate(newPoint);
        printGridInfront(explorer);
        printAvailableMove(explorer);
    }
	
	 private void printCurrentCoordinate(Point point) {
	        System.out.println("Current coordinate: " + point.x + ", " + point.y);
	    }

	    private void printGridInfront(KeyExplorer explorer) {
	        Point currentPoint = explorer.getCurrentPoint();
	        if (currentPoint.y + 1 < explorer.getMaxGridY()) {
	            System.out.println("[" + explorer.getMazeGrid()[currentPoint.x][currentPoint.y + 1] + "] infront of you");

	        } else {
	            System.out.println("You are now at top, no grid infront of you");
	        }
	    }

	    private void printAvailableMove(KeyExplorer explorer) {
	        Point currentPoint = explorer.getCurrentPoint();
	        StringBuilder sb = new StringBuilder();
	        sb.append("You are allow to move ");
	        if (currentPoint.y + 1 < explorer.getMaxGridY()) {
	            sb.append("[UP] ");
	        }

	        if (currentPoint.y - 1 > 0) {
	            sb.append("[DOWN] ");
	        }

	        if (currentPoint.x + 1 < explorer.getMaxGridX()) {
	            sb.append("[RIGHT] ");
	        }

	        if (currentPoint.x - 1 > 0) {
	            sb.append("[LEFT] ");
	        }
	        if (sb.indexOf("[") > 0) {
	           System.out.println(sb.toString());
	        } else {
	            System.out.println("You are not allow to move elsewhere");
	        }
	    }

}
