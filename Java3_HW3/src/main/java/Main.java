package main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

// 1 задание (Прочитать файл (около 50 байт) в байтовый массив и вывести этот массив в консоль;)

        System.out.print("Первое задание: ");

        try (FileInputStream in = new FileInputStream("txts/1-ex.txt")){
            byte [] arr = new byte[512];
            int x;
            while ((x = in.read(arr)) > 0) {
                System.out.print(new String(arr, 0, x, "UTF-8"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

// 2 задание (Последовательно сшить 5 файлов в один (файлы примерно 100 байт).
// Может пригодиться следующая конструкция: ArrayList<InputStream> al = new ArrayList<>(); ... Enumeration<InputStream> e = Collections.enumeration(al);

        System.out.println();
        System.out.print("Второе задание: ");

        ArrayList <InputStream> ali = new ArrayList<>();
        ali.add(new FileInputStream("txts/1.txt"));
        ali.add(new FileInputStream("txts/2.txt"));
        ali.add(new FileInputStream("txts/3.txt"));
        ali.add(new FileInputStream("txts/4.txt"));
        ali.add(new FileInputStream("txts/5.txt"));

        SequenceInputStream sin = new SequenceInputStream(Collections.enumeration(ali));

        int x;

        while ((x = sin.read()) != -1){
            System.out.print((char) x);
        }

// 3 задание (Написать консольное приложение, которое умеет постранично читать текстовые файлы (размером > 10 mb).
// Вводим страницу (за страницу можно принять 1800 символов), программа выводит ее в консоль.
// Контролируем время выполнения: программа не должна загружаться дольше 10 секунд, а чтение – занимать свыше 5 секунд.)
        try {
            thirdTask();
        } catch (IOException e) {
            e.printStackTrace();
        }


        }

    private static void thirdTask() throws IOException{
        System.out.println();
        final int SIZE = 1800;
        Scanner sc = new Scanner(System.in);
        RandomAccessFile raf = new RandomAccessFile("txts/book.txt", "r");


        do {
            long t = System.currentTimeMillis();
            System.out.println("");
            System.out.println("Введите желаемую страницу: ");
            int p = sc.nextInt() - 1;
            raf.seek(p * SIZE);
            for (int i = 0; i < SIZE ; i++) {
                System.out.print((char) raf.read());
        }
            System.out.println(System.currentTimeMillis() - t);
        } while (true);
    }
}
