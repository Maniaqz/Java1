package Java1HW6;

public class Animal {
    protected String type;
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    protected int maxJump;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int dist) {
        if (this.maxRun >= dist) System.out.println(this.type + " " + this.name + " пробегает " + dist + " м.");
        else System.out.println(this.type + " " + this.name + " не добегает до конца.");
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist) System.out.println(this.type + " " + this.name + " проплывает " + dist + " м.");
        else System.out.println(this.type + " " + this.name + " не доплывает до конца.");
    }

    public void jump(double height) {
        if (this.maxJump >= height)
            System.out.println(this.type + " " + this.name + " прыгает на высоту " + height + " м.");
        else System.out.println(this.type + " " + this.name + " прыгает недостаточно высоко.");
    }

    public void info() {
        System.out.println(this.type + " " + this.name + ": Способен пробежать: " +
                this.maxRun + " м., Способен проплыть: " +
                this.maxSwim + " м., Способен прыгнуть на высоту: " + this.maxJump + " м.");
    }

}
