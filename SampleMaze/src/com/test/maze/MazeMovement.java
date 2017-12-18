package com.test.maze;

import java.awt.Point;

public class MazeMovement {
	
	public static Point getPointFromInput(String input, char[][] mazeGrid) {

        try {
            String[] inputArr = input.split(",");
            int x = Integer.parseInt(inputArr[0]);
            int y = Integer.parseInt(inputArr[1]);
            return new Point(x, y);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ALERT: Please enter grid within [" + mazeGrid.length + "][" + mazeGrid[0].length + "]\n");

        } catch (RuntimeException re) {
        	System.out.println("Incorrect coordinate format, example: x,y");
        }
        return new Point(-1, -1);
    }

    /**
     * Get default starting point which mark as 'S' in the maze
     *
     * @param mazeGrid
     * @return
     */
    public static Point getDefaultPoint(char[][] mazeGrid) {
        int maxGridX = mazeGrid.length;
        int maxGridY = mazeGrid[0].length;
        for (int x = 0; x < maxGridX; x++) {
            for (int y = 0; y < maxGridY; y++) {
                if (mazeGrid[x][y] == 'S') {
                	System.out.println("\nYou started at [" + x + "][" + y + "]");
                    return new Point(x, y);
                }
            }
        }
        return new Point(-1, -1);
    }

}
