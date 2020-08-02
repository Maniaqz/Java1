package Java1HW6;

import java.util.Random;

public class Dog extends Animal {

    Random random = new Random();

    public Dog(String name) {
        super(name);
        this.type = "Собака";
        this.maxJump = random.nextInt(2) + 1;
        this.maxRun = random.nextInt(400) + 150;
        this.maxSwim = random.nextInt(300) + 100;
    }
}
