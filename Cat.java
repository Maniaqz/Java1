package Java1HW6;

import java.util.Random;

public class Cat extends Animal {

    Random random = new Random();

    public Cat (String name) {
        super (name);
        this.type = "Кот";
        this.maxJump = random.nextInt(3) + 1;
        this.maxRun = random.nextInt(300) + 150;
    }

    @Override
    public void swim(int dist) {
        System.out.println(this.type + " " + this.name + " не умеет плавать!");
    }

}
