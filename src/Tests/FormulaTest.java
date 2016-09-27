package Tests;

import org.junit.Assert;
import Classes.Formula.Formula;

public class FormulaTest {
    @org.junit.Test
    public void getResult() throws Exception {
        Formula formula = new Formula(0, 0);
        double result = formula.getResult();

        Assert.assertTrue(result == 0.5);
    }

}