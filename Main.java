package HomeworkOne;

public class Main {
    public static void main(String[] args) {
    doTwo();
    System.out.println ();
    System.out.println("Результат выполнения третьего задания: " + doThree(5,9,7,20));
    System.out.println ();
    System.out.println("Результат выполнения четвёртого задания: " + doFour(12,16));
    System.out.println ();
    doFive(-20);
    System.out.println ();
    System.out.println("Результат выполнения шестого задания: " + doSix(-15));
    System.out.println ();
    doSeven("Максим");
    System.out.println ();
    doEight(2020);
    }
        static void doTwo () {
        byte a = 23;
        short b = 57;
        int c = 1489;
        long d = 555689750;

        double e = 99.99;
        float f = 23.678f;

        char g = 'g';
        boolean h = true;
        String i = "конец 1 части задания";

        System.out.println("Значение для типа byte = " + a);
        System.out.println("Значение для типа short = " + b);
        System.out.println("Значение для типа int = " + c);
        System.out.println("Значение для типа long = " + d);
        System.out.println("Значение для типа double = " + e);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа char = [" + g + "]");
        System.out.println("Значение для типа boolean = " + h);
        System.out.println("Значение для типа String = " + i);

    }

    static int doThree (int a, int b, int c, int d) {

        return a * (b + (c / d));

    }

    static boolean doFour (int a, int b) {

        int sum = a + b;
        if (sum <= 20 & sum >= 10){
            return true;
        } else {
            return false;
        }

    }

    static int doFive (int a) {
        if (a >= 0) System.out.println("Результат выполнения пятого задания: Значение \"а\" положительно");
        else System.out.println("Результат выполнения пятого задания: Значение \"а\" отрицательно");
        return a;
    }

    static boolean doSix (int a) {
        if (a >= 0) return false;
        else return true;
    }

    static void doSeven (String name) {

        System.out.println("Результат выполнения седьмого задания: Привет, " + name + "!");

    }

    static void doEight (int year) {

        if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0) System.out.println("Результат выполнения восьмого задания: " + year + " г. - високосный");
        else System.out.println("Результат выполнения восьмого задания: " + year + " г. - не високосный");

    }

}
