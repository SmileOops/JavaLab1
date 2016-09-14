import Classes.BasketBall.Ball;
import Classes.BasketBall.Basket;
import Classes.Book.Book;
import Classes.Book.ProgrammersBook;
import Classes.CoordinateSystem.CheckableRectangle;
import Classes.CoordinateSystem.CoordinateSystem;
import Classes.CoordinateSystem.Point;
import Classes.Formula.Formula;
import Classes.MathFunction.MathFunction;
import Classes.SimpleNumbers.SimpleNumbersArray;
import Classes.SortableArray.SortableArray;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        executeFirstTask();
//        executeSecondTask();
//        executeThirdTask();
//        executeFourthTask();
//        executeNinthTask();
//        executeSeventhTask();
//        executeTwelfthTask();
        executeThirteenthTask();
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

    private static void executeSeventhTask() {
        SortableArray sortableArray = new SortableArray();
        sortableArray.add(5.0);
        sortableArray.add(2.0);
        sortableArray.add(7.0);
        sortableArray.add(11.0);
        sortableArray.add(3.0);
        sortableArray.add(1.0);
        sortableArray.add(10.0);
        sortableArray.add(4.0);
        sortableArray.add(14.0);
        sortableArray.add(8.0);
        sortableArray.add(6.0);
        sortableArray.add(9.0);
        sortableArray.add(13.0);
        sortableArray.add(12.0);
        sortableArray.sortByShell();
    }

    private static void executeNinthTask() {
        Basket basket = new Basket();
        basket.addBall(new Ball(0.3, Color.BLUE));
        basket.addBall(new Ball(0.2, Color.BEIGE));
        basket.addBall(new Ball(0.25, Color.BLACK));
        basket.addBall(new Ball(0.15, Color.BLUE));
        basket.addBall(new Ball(0.28, Color.BLUE));
        System.out.println("There is " + basket.countBalls(Color.BLUE) + " blue balls.");
        System.out.println("Their whole weight is " + basket.getWholeWeight() + " kg."); // round this
    }

    private static void executeTwelfthTask() {
        Book lotrBook = new Book("THE LORD OF THE RINGS", "J. R. R. TOLKIEN", 20, 5);
        System.out.println(lotrBook.toString());
        System.out.println(lotrBook.hashCode());
        Book silmBook = new Book("SILMARILLION", "J. R. R. TOLKIEN", 10, 2);
        System.out.println(lotrBook.equals(silmBook));
    }

    private static void executeThirteenthTask() {
        Book cleanCodeBook = new ProgrammersBook("CLEAN CODE", "ROBERT MARTIN", 20, 5, "ENGLISH", 6);
        System.out.println(cleanCodeBook.toString());
        System.out.println(cleanCodeBook.hashCode());
        Book javaBook = new ProgrammersBook("THINKING IN JAVA", "BRUCE EKKEL", 30, 4, "RUSSIAN", 4);
        System.out.println(cleanCodeBook.equals(javaBook));
    }


}
