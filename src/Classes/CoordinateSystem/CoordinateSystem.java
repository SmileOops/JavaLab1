package Classes.CoordinateSystem;

import java.util.ArrayList;

public class CoordinateSystem {

    private ArrayList<Point> points = new ArrayList<Point>();
    private ArrayList<CheckableRectangle> checkableAreas = new ArrayList<CheckableRectangle>();

    public CoordinateSystem() {

    }

    public void addPoint(Point point) {
        if (point != null) {
            points.add(point);
        } else {
            System.out.println("Cannot add uninitialized point!");
        }

    }

    public void addCheckableRectangle(CheckableRectangle checkableRectangle) {
        if (checkableRectangle != null) {
            checkableAreas.add(checkableRectangle);
        } else {
            System.out.println("Cannot add uninitialized checkable area!");
        }
    }

    public void checkPoints() {
        for (Point point : points) {
            boolean isInCheckableArea = false;
            for (CheckableRectangle rectangle : checkableAreas) {
                if (rectangle.ContainsPoint(point)) {
                    isInCheckableArea = true;
                    break;
                }
            }
            System.out.println("[" + point.getX() + ";" + point.getY() + "] - " + isInCheckableArea);
        }
    }
}
