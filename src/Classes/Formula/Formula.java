package Classes.Formula;

public class Formula {

    private double x;
    private double y;

    public Formula (double x, double y){
        this.x = x;
        this.y = y;
    }

    public double GetResult (){
        return GetNumerator() / GetDenominator() + x;
    }

    private double GetNumerator (){
        return 1 + Math.sin(x + y);
    }

    private double GetDenominator (){
        return 2 + Math.abs(x - (2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)));
    }


}
