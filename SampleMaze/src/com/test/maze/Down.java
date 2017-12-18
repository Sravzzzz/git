package com.test.maze;

import java.awt.Point;

public class Down {
	
	private final KeyExplorer explorer;

    public Down(KeyExplorer keyExplorer) {
        this.explorer = keyExplorer;
    }

    public void move() {
        Point point = explorer.getCurrentPoint();
        Movement mov=new Movement();
        if (point.y - 1 >= 0) {
            point.y--;
            Point newPoint = new Point(point.x, point.y);
            mov.updateExplorer(newPoint, explorer, KeyExplorer.MOVE.DOWN);

        } else {
            System.out.println("You are at the bottom of wall, not allow to move down");
        }
    }


}
