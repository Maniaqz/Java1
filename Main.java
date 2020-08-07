package Java1HW7;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            Cat[] cat = new Cat[3];
            cat[0] = new Cat("Boris", 30, false);
            cat[1] = new Cat("Moris", 50, false);
            cat[2] = new Cat("Doris", 40, false);

            Plate plate = new Plate(100);

            System.out.println("You've got 3 cats: " + cat[0].getName() + ", "
                    + cat[1].getName() + ", "
                    + cat[2].getName() + ".");
            for (int i = 0; i < cat.length; i++) {
                System.out.println();
                cat[i].info();
            }
            System.out.println();
            System.out.print("And a relatively small food "); plate.info();

            System.out.println("======================================");

            do {
                for (Cat i : cat){
                    i.eat(plate);
                    System.out.println();
                    plate.info();
                    System.out.println();
                }
                System.out.println("======================================");
                System.out.println("Mind adding some more feed? [1 = accept / else = refuse]");

                int addFood = scanner.nextInt();

                if (addFood == 1){
                    plate.increaseFood();
                    plate.info();

                    for (Cat i : cat){
                        i.eat(plate);
                        System.out.println();
                        plate.info();
                        System.out.println();
                    }

                } else System.out.println("Cat died of hunger. With it's death, the thread of prophecy is severed. " +
                        "Restore a saved game to restore the weave of fate, " +
                        "or persist in the doomed world you have created");

            } while (plate.getFood() == 0);

        }
}
