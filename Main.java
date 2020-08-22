package HW21;


public class Main{

    public static void main(String[] args) {
    Participants participants[] = {
            new Human ("Torbjorn", 1, 100),
            new Cat("Boris", 1, 50),
            new Robot("Shodan", 3, 250)};

    Obstacles obstacles [] = {
            new Track(50, "track #1"),
            new Fence(1, "fence #1"),
            new Track(100, "track #2"),
            new Fence(3, "fence #2")};

            for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++)
                if (obstacles[j].distance != 0 & participants[i].runDistance >= obstacles[j].distance) {
                    participants[i].run();
                } else if (obstacles[j].height != 0 & participants[i].jumpHeight >= obstacles[j].height){
                    participants[i].jump();
                } else {
                    participants[i].jumpHeight = 0;
                    participants[i].runDistance = 0;
                    System.out.println(participants[i].name + " couldn't withstand the challenges of " + obstacles[j].name + " and remains idle");
                }
            }

    }

}
