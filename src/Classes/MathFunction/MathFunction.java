package Classes.MathFunction;

import java.util.Map;
import java.util.TreeMap;

public class MathFunction {

    private double a;
    private double b;
    private double step;

    public MathFunction(double a, double b, double step) {
        this.a = a;
        this.b = b;
        this.step = step;
    }

    public Map<Double, Double> getResultTable() {
        Map<Double, Double> result = new TreeMap<>();
        double i = a;
        while (i < this.b) {
            result.put(i, getFunctionResult(i));
            i += this.step;
        }

        return result;
    }

    private double getFunctionResult(double x) {
        return Math.tan(x);
    }
}
