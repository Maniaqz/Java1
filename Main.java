package HW25;

import java.util.Arrays;

public class Main {

    static final int size = 1000;
    static final int h = size / 2;

    public static void main(String[] args) {
        doOne(createArray());
        doTwo(createArray());

    }

    private static float[] createArray () {
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        return arr;
    }


    private static void doOne(float[] arr) {
        System.out.println("Starts 1");
        System.out.println(Arrays.toString(arr));
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Total time for 1 array: ");
        System.out.println(System.currentTimeMillis() - a);
    }


    private static void doTwo(float[] arr) {
        System.out.println(Arrays.toString(arr));
        float[] arrOne = new float[h];
        float[] arrTwo = new float[h];
        long b = System.currentTimeMillis();
        System.arraycopy(arr, 0, arrOne, 0, h);
        System.arraycopy(arr, h, arrTwo, 0, h);
        System.out.println(Arrays.toString(arrOne));
        System.out.println(Arrays.toString(arrTwo));
        Thread calcOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arrOne.length; i++) {
                    arrOne[i] = (float)(arrOne[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        calcOne.start();

        Thread calcTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starts 2");
                for (int i = 0; i < arrTwo.length; i++) {
                    arrTwo[i] = (float) (arrTwo[i] * Math.sin(0.2f + (i+h) / 5) * Math.cos(0.2f + (i+h) / 5) * Math.cos(0.4f + (i+h) / 2));
                }
            }

        });
        calcTwo.start();

        try {
            calcOne.join();
            calcTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arrOne, 0, arr, 0, h);
        System.arraycopy(arrTwo, 0, arr, h, h);
        System.out.println(Arrays.toString(arr));
        System.out.println("Total time for 2 array: ");
        System.out.println(System.currentTimeMillis() - b);
    }
}