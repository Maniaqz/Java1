package Java1HW7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        }
    }

    void increaseFood() {
            this.food += 100;
            System.out.println("You've added 100 grams of feed");
        }

    public void info() {
        System.out.println("Plate: " + food);
    }

}
