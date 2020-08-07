package Java1HW7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hunger;
    public Cat(String name, int appetite, boolean hunger) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println(this.name + " dossier: " + "appetite " + this.appetite + " / is well-fed " + this.hunger);
    }

    void eat(Plate plate) {
        if (plate.getFood() > appetite && this.hunger == false) {
            plate.decreaseFood(appetite);
            this.hunger = true;
            System.out.println(this.name + " eats " + this.appetite + " grams of feed, and is now well-fed");
        } else if (this.hunger == true){
            System.out.println(this.name + " isn't hungry");
        } else {
            System.out.println(this.name + " refuses to eat leftovers");
        }
    }
}
