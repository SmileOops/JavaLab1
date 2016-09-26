package Classes.Matrix;

public class Matrix {
    public static double[][] GetMatrix(double[] array) {
        double[][] matrix = new double[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array, 0, matrix[i], array.length - i, i);
            System.arraycopy(array, i, matrix[i], 0, array.length - i);
        }
        return matrix;
    }
}
