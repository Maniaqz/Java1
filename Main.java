package Java1HW6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int runDistance = random.nextInt (500);
        int swimDistance = random.nextInt (300);
        int jumpDistance = random.nextInt(4);

        System.out.println(String.format("В этом раунде животные должны будут: " +
                "\n 1. Пробежать дистанцию в %s метров " +
                "\n 2. Проплыть дистанцию в %s метров " +
                "\n 3. Прыгнуть на высоту %s метров", runDistance, swimDistance, jumpDistance));

        System.out.println();

        Cat cat1 = new Cat("Цезарь");
        Cat cat2 = new Cat("Базилио");

        Dog dog1 = new Dog("Люцифер");
        Dog dog2 = new Dog("Жан Батист");

        cat1.info();
        cat2.info();

        System.out.println();

        dog1.info();
        dog2.info();

        System.out.println();

        dog1.run(runDistance);
        dog1.swim(swimDistance);
        dog1.jump(jumpDistance);

        System.out.println();

        cat1.run(runDistance);
        cat1.swim(swimDistance);
        cat1.jump(jumpDistance);
    }
}
