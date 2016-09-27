package Tests;

import Classes.CoordinateSystem.CheckableRectangle;
import Classes.CoordinateSystem.Point;
import org.junit.Assert;
import org.junit.Test;

public class CheckableRectangleTest {


    @Test
    public void firstQuarterTest() throws Exception {
        CheckableRectangle checkableRectangle = new CheckableRectangle(5, -2, -4, 4);
        boolean insidePointFlag = checkableRectangle.ContainsPoint(new Point(3, 2));
        boolean outsidePointFlag = checkableRectangle.ContainsPoint(new Point(6, 2));
        boolean borderPointFlag = checkableRectangle.ContainsPoint(new Point(4, 5));

        Assert.assertTrue(insidePointFlag && borderPointFlag && !outsidePointFlag);
    }

    @Test
    public void secondQuarterTest() throws Exception {
        CheckableRectangle checkableRectangle = new CheckableRectangle(5, -2, -4, 4);
        boolean insidePointFlag = checkableRectangle.ContainsPoint(new Point(-3, 2));
        boolean outsidePointFlag = checkableRectangle.ContainsPoint(new Point(-6, 2));
        boolean borderPointFlag = checkableRectangle.ContainsPoint(new Point(-4, 5));

        Assert.assertTrue(insidePointFlag && borderPointFlag && !outsidePointFlag);
    }

    @Test
    public void thirdQuarterTest() throws Exception {
        CheckableRectangle checkableRectangle = new CheckableRectangle(5, -2, -4, 4);
        boolean insidePointFlag = checkableRectangle.ContainsPoint(new Point(-1, -1));
        boolean outsidePointFlag = checkableRectangle.ContainsPoint(new Point(-6, -6));
        boolean borderPointFlag = checkableRectangle.ContainsPoint(new Point(-4, -2));

        Assert.assertTrue(insidePointFlag && borderPointFlag && !outsidePointFlag);
    }

    @Test
    public void fourthQuarterTest() throws Exception {
        CheckableRectangle checkableRectangle = new CheckableRectangle(5, -2, -4, 4);
        boolean insidePointFlag = checkableRectangle.ContainsPoint(new Point(3, -1));
        boolean outsidePointFlag = checkableRectangle.ContainsPoint(new Point(6, -2));
        boolean borderPointFlag = checkableRectangle.ContainsPoint(new Point(4, -2));

        Assert.assertTrue(insidePointFlag && borderPointFlag && !outsidePointFlag);
    }

}