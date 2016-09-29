package Tests;

import Classes.Formula.Formula;
import org.junit.Assert;

public class FormulaTest {
    @org.junit.Test
    public void getResult() throws Exception {
        Formula formula = new Formula(0, 0);
        double result = formula.getResult();

        Assert.assertTrue(result == 0.5);
    }

}