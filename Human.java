package HW21;

public class Human extends Participants {

    public Human(String name, int jumpHeight, int runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public void run() {
        System.out.println(this.name + " the Human runs...");
    }

    @Override
    public void jump() {
        System.out.println(this.name + " the Human jumps...");
    }

}
