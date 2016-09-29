package Tests;

import Classes.SimpleNumbers.SimpleNumbersArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SimpleNumbersArrayTest {
    @Test
    public void getSimpleNumberIndexes() throws Exception {
        SimpleNumbersArray numbers = new SimpleNumbersArray();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        ArrayList<Integer> result = numbers.GetSimpleNumberIndices();

        ArrayList<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(5);
        expectedResult.add(7);

        Assert.assertEquals(expectedResult, result);
    }

}