package Classes.Formula;

public class Formula {

    private double x;
    private double y;

    public Formula(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getResult() {
        return getNumerator() / getDenominator() + x;
    }

    private double getNumerator() {
        return 1 + Math.sin(x + y);
    }

    private double getDenominator() {
        return 2 + Math.abs(x - (2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)));
    }


}
