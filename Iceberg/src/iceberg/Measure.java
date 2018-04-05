package iceberg;

public class Measure {
    private final Position position;
    private final Volume volume;

    public Measure(final Position position, final Volume volume) {
        this.position = position;
        this.volume = volume;
    }

    public Position getPosition() {
        return position;
    }

    public Volume getVolume() {
        return volume;
    }
    
    public String toString() {
        return "Position - " + position.toString() + " " + volume.toString();
    }
}