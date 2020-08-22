package HW21;

public class Cat extends Participants {

    public  Cat (String name, int jumpHeight, int runDistance){
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public void run() {
        System.out.println(this.name + " the Cat runs...");
    }

    @Override
    public void jump() {
        System.out.println(this.name + " the Cat jumps...");
    }
}
