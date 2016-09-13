import Classes.BasketBall.Ball;
import Classes.BasketBall.Basket;
import Classes.CoordinateSystem.CheckableRectangle;
import Classes.CoordinateSystem.CoordinateSystem;
import Classes.CoordinateSystem.Point;
import Classes.Formula.Formula;
import Classes.MathFunction.MathFunction;
import Classes.SimpleNumbers.SimpleNumbersArray;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        executeFirstTask();
//        executeSecondTask();
//        executeThirdTask();
//        executeFourthTask();
        executeNinthTask();
    }

    private static void executeFirstTask() {
        Formula formula = new Formula(0, 0);
        System.out.println("Task 1: " + formula.getResult());
    }

    private static void executeSecondTask() {
        CoordinateSystem coordinateSystem = new CoordinateSystem();
        coordinateSystem.addCheckableRectangle(new CheckableRectangle(5, 0, -4, 4));
        coordinateSystem.addCheckableRectangle(new CheckableRectangle(0, -3, -6, 6));
        coordinateSystem.addPoint(new Point(1, 1));
        coordinateSystem.addPoint(new Point(4, 0));
        coordinateSystem.addPoint(new Point(-6, -3));
        coordinateSystem.addPoint(new Point(-6, 15));
        coordinateSystem.checkPoints();

    }

    private static void executeThirdTask() {
        MathFunction function = new MathFunction(1, 50, 4);
        function.getResultTable();
    }

    private static void executeFourthTask() {
        SimpleNumbersArray numbers = new SimpleNumbersArray();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        ArrayList<Integer> result = numbers.GetSimpleNumberIndexes();
        numbers.add(7);
    }

    private static void executeNinthTask() {
        Basket basket = new Basket();
        basket.AddBall(new Ball(0.3, Color.BLUE));
        basket.AddBall(new Ball(0.2, Color.BEIGE));
        basket.AddBall(new Ball(0.25, Color.BLACK));
        basket.AddBall(new Ball(0.15, Color.BLUE));
        basket.AddBall(new Ball(0.28, Color.BLUE));
        System.out.println("There is " + basket.CountBalls(Color.BLUE) + " blue balls.");
        System.out.println("Their whole weight is " + basket.GetWholeWeight() + " kg."); // round this
    }
}
