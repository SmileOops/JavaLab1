package Tests;

import Classes.CoordinateSystem.CheckableRectangle;
import Classes.CoordinateSystem.CoordinateSystem;
import Classes.CoordinateSystem.Point;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinateSystemTest {
    @Test
    public void addPoint() throws Exception {
        CoordinateSystem coordinateSystem = new CoordinateSystem();

        coordinateSystem.AddPoint(null);
    }

    @Test
    public void addCheckableRectangle() throws Exception {
        CoordinateSystem coordinateSystem = new CoordinateSystem();

        coordinateSystem.AddCheckableRectangle(null);
    }
}