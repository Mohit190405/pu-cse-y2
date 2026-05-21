// Main.java
public class Main {
    public static void main(String[] args) {
        // Matrix A
        Matrix a = new Matrix(2, 2);
        a.setValue(0, 0, 1);
        a.setValue(0, 1, 2);
        a.setValue(1, 0, 3);
        a.setValue(1, 1, 4);

        // Matrix B
        Matrix b = new Matrix(2, 2);
        b.setValue(0, 0, 5);
        b.setValue(0, 1, 6);
        b.setValue(1, 0, 7);
        b.setValue(1, 1, 8);

        // Display
        System.out.println("Matrix A:");
        System.out.println(a);

        System.out.println("Matrix B:");
        System.out.println(b);

        // Addition
        System.out.println("A + B:");
        System.out.println(a.add(b));

        // Subtraction
        System.out.println("A - B:");
        System.out.println(a.subtract(b));

        // Multiplication
        System.out.println("A * B:");
        System.out.println(a.multiply(b));

        // Transpose
        System.out.println("Transpose of A:");
        System.out.println(a.transpose());
    }
}

class Matrix {
    private int rows;
    private int cols;
    private double[][] data;

    public Matrix(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Rows and columns must be positive");
        }
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    public void setValue(int row, int col, double value) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IndexOutOfBoundsException("Invalid row or column index");
        }
        data[row][col] = value;
    }

    public Matrix add(Matrix other) {
        if (other == null || other.rows != this.rows || other.cols != this.cols) {
            throw new IllegalArgumentException("Matrix dimensions must match for addition");
        }
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public Matrix subtract(Matrix other) {
        if (other == null || other.rows != this.rows || other.cols != this.cols) {
            throw new IllegalArgumentException("Matrix dimensions must match for subtraction");
        }
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] - other.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        if (other == null || this.cols != other.rows) {
            throw new IllegalArgumentException("Matrix dimensions incompatible for multiplication");
        }
        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < result.rows; i++) {
            for (int j = 0; j < result.cols; j++) {
                double sum = 0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.data[i][k] * other.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }
        return result;
    }

    public Matrix transpose() {
        Matrix t = new Matrix(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                t.data[j][i] = this.data[i][j];
            }
        }
        return t;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append("[");
            for (int j = 0; j < cols; j++) {
                sb.append(formatNumber(data[i][j]));
                if (j < cols - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            if (i < rows - 1) {
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    private String formatNumber(double v) {
        if (v == (long) v) {
            return String.valueOf((long) v);
        } else {
            return String.valueOf(v);
        }
    }
}
