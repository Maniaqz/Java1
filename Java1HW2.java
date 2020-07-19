package Homework;

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {

        System.out.print("Результат выполнения первого задания: "); doOne();
        System.out.println();
        System.out.println("==============================================");
        System.out.print("Результат выполнения второго задания: "); doTwo();
        System.out.println();
        System.out.println("==============================================");
        System.out.print("Результат выполнения третьего задания: "); doThree();
        System.out.println();
        System.out.println("==============================================");
        System.out.println("Результат выполнения четвёртого задания: \n"); doFour();
        System.out.println();
        System.out.println("==============================================");
        System.out.println("Результат выполнения пятого задания: \n"); doFive();
        System.out.println();
        System.out.println("==============================================");
        System.out.println("\nПервый вариант выполнения шестого задания задания: " + doSix (new int[] {2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println("Второй вариант выполнения шестого задания задания: " + doSix (new int[] {2, 2, 2, 1, 2, 2, 10, 30}));
        System.out.println();
        System.out.println("==============================================");
        doSeven(new int[] {6, 2, 6, 12, 3, 1, 8, 9, 2}, -5);
        System.out.println();
        System.out.println("==============================================");

    }

    static void doOne () {
        int[] arraybin = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arraybin.length; i++) {
            if (arraybin[i] == 1) arraybin[i] = 0;
            else arraybin[i] = 1;
            System.out.print(arraybin[i] + " ");
        }
    }

    static void doTwo () {
        int[] array = new int[8];
        for (int i = 0, j = 0; i < array.length; i++, j = j + 3) {
            array [i] = j;
        };
        System.out.print(Arrays.toString(array));
    }

    static void doThree () {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) if (array [i] < 6) array [i] *= 2;
        System.out.print(Arrays.toString(array));
    }

    static void doFour() {
        int[][] multiarray = new int [10] [10];
        for (int i = 0; i < multiarray.length; i++){
            for (int j = 0; j < multiarray.length; j++){
                if (i == j) multiarray [i][j] = 1;
                else multiarray [i] [j] = 0;
                System.out.print(multiarray[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void doFive() {
        int [] minmaxarray = {15,26,66,-35,77,34,-15,20};
        int minValue = minmaxarray[0];
        int maxValue = minmaxarray[0];
        for (int i = 1; i < minmaxarray.length; i++)
            if(minmaxarray[i] < minValue) {
                minValue = minmaxarray[i];
        }
        System.out.println("Минимальное значение массива: " + minValue);

        for (int i = 1; i < minmaxarray.length; i++)
            if(minmaxarray[i] > maxValue){
                maxValue = minmaxarray [i];
            }
        System.out.println("Максимальное значение массива: " + maxValue);
    }

    static boolean doSix (int[] array) {
        int leftSum, rightSum;

        for (int i = 0; i < array.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum = leftSum + array[j];
            }

            for (int j = i; j < array.length; j++) {
                rightSum =  rightSum + array[j];
            }

            if (leftSum == rightSum) return true;
        }
         return false;
    }

    static void doSeven(int[] arr, int n) {
        System.out.print("ДО: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("(n = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }

        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }

        System.out.print("\nПОСЛЕ:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
