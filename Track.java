package HW21;

public class Track extends Obstacles{

    public Track (int distance, String name){
        this.name = name;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}
