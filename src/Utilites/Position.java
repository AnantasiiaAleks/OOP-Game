package Utilites;

import java.util.ArrayList;
import java.util.List;

public class Position {
    private int x;
    private  int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

//    public List<Integer> getPosition(int x, int y) {
//        List<Integer> pos = new ArrayList<>();
//        pos.add(x);
//        pos.add(y);
//        return pos;
//    }

    public Double getDistance (BaseChar target) {
        double targetDistance = 0;
        targetDistance = Math.sqrt((Math.pow(target.position.getX() - this.getX(), 2)) +
                (Math.pow(target.position.getY() - this.getY(), 2)));
        return targetDistance;
    }
}
