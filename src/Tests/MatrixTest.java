package Tests;

import Classes.Matrix.Matrix;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void getMatrix() throws Exception {
        double[] array = new double[]{1, 2, 3, 4};
        double[][] result = Matrix.GetMatrix(array);
        double[][] expectedResult = {{1, 2, 3, 4},
                                     {2, 3, 4, 1},
                                     {3, 4, 1, 2},
                                     {4, 1, 2, 3}};

        Assert.assertArrayEquals(expectedResult, result);
    }

}