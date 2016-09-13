package Classes.MathFunction;

public class MathFunction {

    private double a;
    private double b;
    private double step;

    public MathFunction(double a, double b, double step) {
        this.a = a;
        this.b = b;
        this.step = step;
    }

    public void getResultTable () {
        double i = a;
        while (i < this.b) {
            System.out.println(i + " " + getFunctionResult(this.a));
            i += this.step;
        }
    }

    private double getFunctionResult(double x) {
        return Math.tan(x);
    }
}
