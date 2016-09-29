package Tests;

import Classes.CoordinateSystem.CoordinateSystem;
import org.junit.Test;

public class CoordinateSystemTest {
    @Test
    public void addPoint() throws Exception {
        CoordinateSystem coordinateSystem = new CoordinateSystem();

        coordinateSystem.addPoint(null);
    }

    @Test
    public void addCheckableRectangle() throws Exception {
        CoordinateSystem coordinateSystem = new CoordinateSystem();

        coordinateSystem.addCheckableRectangle(null);
    }
}