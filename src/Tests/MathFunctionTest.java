package Tests;

import Classes.MathFunction.MathFunction;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class MathFunctionTest {
    @Test
    public void getResultTable() throws Exception {
        Map<Double, Double> expectedResult = new TreeMap<>();
        expectedResult.put(5.0, -3.380515006246586);
        expectedResult.put(10.0, 0.6483608274590866);
        expectedResult.put(15.0, -0.8559934009085188);

        MathFunction function = new MathFunction(5, 20, 5);
        Map<Double, Double> result = function.getResultTable();

        Assert.assertEquals(result, expectedResult);
    }

}