import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int row;
        int column;

        Scanner sc = new Scanner(System.in);


        System.out.println("Create a 2-dimensional array (can be only 4x4) by entering the size of");
        System.out.print("Row: ");
        row = sc.nextInt();
        System.out.print("Column: ");
        column = sc.nextInt();

        String[][] newArray = new String[row][column];

        try {
            createArr(newArray, sc, row, column);
            System.out.println("Sum is " + +calcArr(newArray, row, column));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private static void createArr(String[][] array, Scanner sc, int row, int column) {
        if (row != 4 || column != 4) throw new MyArraySizeException(row, column);
        System.out.println("Create Array ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("New row " + i + " column " + j);
                array[i][j] = sc.next();
            }
        }
        printArr(array);
        calcArr(array, row, column);
    }

    private static int calcArr(String[][] array, int row, int column) {
        int sum = 0;
        int[][] arrayInt = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    arrayInt[i][j] = Integer.parseInt(array[i][j]);
                    sum += arrayInt[i][j];
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        printArrInt(arrayInt);
        return sum;
    }

    private static void printArr(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    private static void printArrInt(int[][] array) {
        System.out.println("This arr consist of Int values ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
