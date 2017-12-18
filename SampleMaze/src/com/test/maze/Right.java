package com.test.maze;

import java.awt.Point;

public class Right {

	private final KeyExplorer explorer;

    public Right(KeyExplorer keyExplorer) {
        this.explorer = keyExplorer;
    }

    public void move() {
        Point point = explorer.getCurrentPoint();
        Movement mov=new Movement();
        if (point.x + 1 < explorer.getMaxGridX()) {
            point.x++;
            Point newPoint = new Point(point.x, point.y);
            mov.updateExplorer(newPoint, explorer, KeyExplorer.MOVE.RIGHT);

        } else {
            System.out.println("You are at the most right of wall, not allow to move right");
        }
    }
}
