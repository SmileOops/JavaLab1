import Classes.BasketBall.Ball;
import Classes.BasketBall.Basket;
import Classes.Book.Book;
import Classes.Book.ProgrammersBook;
import Classes.CoordinateSystem.CheckableRectangle;
import Classes.CoordinateSystem.CoordinateSystem;
import Classes.CoordinateSystem.Point;
import Classes.Formula.Formula;
import Classes.IncreasingSequence.Sequence;
import Classes.IncreasingSequence.SequencesMerger;
import Classes.MathFunction.MathFunction;
import Classes.Matrix.Matrix;
import Classes.SimpleNumbers.SimpleNumbersArray;
import Classes.SortableArray.SortableArray;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        executeFirstTask();
        executeSecondTask();
        executeThirdTask();
        executeFourthTask();
        executeFifthTask();
        executeSixthTask();
        executeSeventhTask();
        executeEighthTask();
        executeNinthTask();
        executeTwelfthTask();
        executeThirteenthTask();
    }

    private static void executeFirstTask() {
        Formula formula = new Formula(0, 0);
        System.out.println("Task 1: " + formula.getResult());

        System.out.println();
        System.out.println();
        System.out.println();
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

        System.out.println();
        System.out.println();
        System.out.println();
    }

    private static void executeThirdTask() {
        MathFunction function = new MathFunction(0, 20, 5);
        Map<Double, Double> tangentsTable = function.getResultTable();

        tangentsTable.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println();
        System.out.println();
        System.out.println();
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
        ArrayList<Integer> result = numbers.GetSimpleNumberIndices();
        result.forEach(System.out::println);

        System.out.println();
        System.out.println();
        System.out.println();
    }

    private static void executeFifthTask() {
        Sequence sequence = new Sequence();

        sequence.add(20);
        sequence.add(40);
        sequence.add(10);
        sequence.add(12);
        sequence.add(13);
        sequence.add(11);
        sequence.add(12);
        sequence.add(13);
        sequence.add(14);
        sequence.add(5);

        System.out.print(sequence.GetUselessElementsCount());

        System.out.println();
        System.out.println();
        System.out.println();
    }

    private static void executeSixthTask() {
        double[] array = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[][] matrix = Matrix.GetMatrix(array);
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
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
        sortableArray.forEach(System.out::println);
    }

    private static void executeEighthTask() {
        double[] firstSequence = new double[]{10, 20, 20, 21, 25, 25, 26, 30, 35, 47};
        double[] secondSequence = new double[]{14, 24, 28, 30, 40, 50, 60, 60, 70, 70};
        int[] result = SequencesMerger.GetMergeIndices(firstSequence, secondSequence);
        for (int index : result) {
            System.out.print(index + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println();
    }

    private static void executeNinthTask() {
        Basket basket = new Basket();
        basket.addBall(new Ball(30, Color.BLUE));
        basket.addBall(new Ball(20, Color.BEIGE));
        basket.addBall(new Ball(25, Color.BLACK));
        basket.addBall(new Ball(15, Color.BLUE));
        basket.addBall(new Ball(28, Color.BLUE));
        System.out.println("There is " + basket.countBalls(Color.BLUE) + " blue balls.");
        System.out.println("Their whole weight is " + basket.getWholeWeight() + " kg."); // round this
    }

    private static void executeTwelfthTask() {
        Book lotrBook = new Book("THE LORD OF THE RINGS", "J. R. R. TOLKIEN", 20, 5, "2-266-11156-6");
        System.out.println(lotrBook.toString());
        System.out.println(lotrBook.hashCode());
        Book silmBook = new Book("SILMARILLION", "J. R. R. TOLKIEN", 10, 2, "2-253-10034-3");
        System.out.println(lotrBook.equals(silmBook));
    }

    private static void executeThirteenthTask() {
        Book cleanCodeBook = new ProgrammersBook("CLEAN CODE", "ROBERT MARTIN", 20, 5, "2-266-11156-6", "ENGLISH", 6);
        System.out.println(cleanCodeBook.toString());
        System.out.println(cleanCodeBook.hashCode());
        Book javaBook = new ProgrammersBook("THINKING IN JAVA", "BRUCE EKKEL", 30, 4, "2-253-10034-3", "RUSSIAN", 4);
        System.out.println(cleanCodeBook.equals(javaBook));
    }

}
