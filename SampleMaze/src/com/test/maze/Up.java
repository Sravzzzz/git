package com.test.maze;

import java.awt.Point;

public class Up {
	

    private final KeyExplorer explorer;

    public Up(KeyExplorer keyExplorer) {
        this.explorer = keyExplorer;
    }

    
    public void move() {
        Point point = explorer.getCurrentPoint();
        Movement mov= new Movement();
        if (point.y + 1 < explorer.getMaxGridY()) {
            point.y++;
            Point newPoint = new Point(point.x, point.y);
            mov.updateExplorer(newPoint, explorer, KeyExplorer.MOVE.UP);

        } else {
            System.out.println("You are at the top of wall, not allow to move up");
        }
    }

}
