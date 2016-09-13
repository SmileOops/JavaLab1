import Classes.CoordinateSystem.CheckableRectangle;
import Classes.CoordinateSystem.CoordinateSystem;
import Classes.CoordinateSystem.Point;
import Classes.Formula.Formula;

public class Main {

    public static void main(String[] args) {


        Formula formula = new Formula(0, 0);
        System.out.println("Task 1: " + formula.GetResult());


        CoordinateSystem coordinateSystem = new CoordinateSystem();
        coordinateSystem.AddCheckableRectangle(new CheckableRectangle(5, 0, -4, 4));
        coordinateSystem.AddCheckableRectangle(new CheckableRectangle(0, -3, -6, 6));
        coordinateSystem.AddPoint(new Point(1, 1));
        coordinateSystem.AddPoint(new Point(4, 0));
        coordinateSystem.AddPoint(new Point(-6, -3));
        coordinateSystem.AddPoint(new Point(-6, 15));
        coordinateSystem.CheckPoints();

    }
}
