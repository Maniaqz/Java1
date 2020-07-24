package Java1HW3;

import java.util.Scanner;
import java.lang.Math;

class Main {

    public static void main(String[] args) {
        GuessingGame();

    }

    public static void GuessingGame(){
        Scanner in = new Scanner(System.in);

        int a, n = (int)(Math.random()*10);
        System.out.println("Загадано число от 0 до 9, угадайте это число с 3 попыток.");
        for (int i = 0; i < 3; i++){
            System.out.println("Попытка " + (i+1) + ": ");
            a = in.nextInt();
            if (a < n) System.out.println("Загаданное число больше!");
            if (a > n) System.out.println("Загаданное число меньше!");
            if (a == n) {System.out.println("Поздравляем, вы угадали!");
                System.out.println("Повторите игру ещё раз? 1 – да / 0 – нет");
                a = in.nextInt();
                if (a == 1) GuessingGame();
                else {System.out.println("Спасибо за игру!");
                    break;
                }
            }
        }
        System.out.println("Вам не удалось угадать");
        System.out.println("Повторите игру ещё раз? 1 – да / 0 – нет");
        a = in.nextInt();
        if (a == 1) GuessingGame();
        else {System.out.println("Спасибо за игру!");
        }
    }
}