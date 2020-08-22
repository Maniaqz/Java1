package HW21;

public class Robot extends Participants {

    public Robot (String name, int jumpHeight, int runDistance){
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public void run() {
        System.out.println(this.name + " the Robot runs...");
    }

    @Override
    public void jump() {
        System.out.println(this.name + " the Robot jumps...");
    }
}
