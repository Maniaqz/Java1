import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
    }

    private static void taskOne() {

        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {" one ", " two ", " three ", " four ", " five "};

        System.out.println("Даны следующие массивы:");

        System.out.println("Integer-массив: " + Arrays.toString(iArray));
        System.out.println("Double-массив: " + Arrays.toString(dArray));
        System.out.println("String-массив: " + Arrays.toString(sArray));

        try {
            swapArray(iArray, 0, 1);
            swapArray(dArray, 1, 2);
            swapArray(sArray, 3, 4);
        } catch (PositionException e) {
            e.printStackTrace();
        }

        System.out.println("Результат выполнения замены в Integer-массиве: " + Arrays.toString(iArray));
        System.out.println("Результат выполнения замены в Double-массиве: " + Arrays.toString(dArray));
        System.out.println("Результат выполнения замены в String-массиве: " + Arrays.toString(sArray));

    }


    private static void swapArray(Object[] array, int firstNumPos, int secondNumPos) throws PositionException {
        if (firstNumPos < 0 ||
                firstNumPos > array.length ||
                secondNumPos < 0 ||
                secondNumPos > array.length ||
                firstNumPos == secondNumPos) {
            throw new PositionException("Неверно указаны позиции меняющихся элементов");
        }
        Object temp = array[firstNumPos];
        array[firstNumPos] = array[secondNumPos];
        array[secondNumPos] = temp;
    }


    private static void taskTwo() {
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {" one ", " two ", " three ", " four ", " five "};

        arrayAsList(iArray);
        arrayAsList(dArray);
        arrayAsList(sArray);
    }

    private static <T> ArrayList arrayAsList (T[] array){
        return new ArrayList<>(Arrays.asList(array));
    }

    private static void taskThree() {
        Box <Orange> boxWithOranges = new Box<>(new Orange(), new Orange(), new Orange());
        Box <Apple> boxWithApples = new Box<>(new Apple(), new Apple(), new Apple());
        Box <Apple> anotherBoxWithApples = new Box<>(new Apple(), new Apple(), new Apple(), new Apple(), new Apple());

        System.out.println("Вес коробки с апельсинами: " + boxWithOranges.getWeight());
        System.out.println("Вес коробки с яблоками: " + boxWithApples.getWeight());
        System.out.println("Вес ещё одной коробки с яблоками: " + anotherBoxWithApples.getWeight());

        System.out.println(boxWithApples.compare(boxWithOranges));

        boxWithApples.swapToAnotherBox(anotherBoxWithApples);
        System.out.println(boxWithApples.getBox());
        System.out.println(anotherBoxWithApples.getBox());
    }

}