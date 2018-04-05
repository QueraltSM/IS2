package iceberg;

public class Volume {
    private final String volume;

    public Volume() {
        volume = "";
    }

    public Volume(final String volume){
        this.volume = volume;
    }

    public String toString() {
        return "\nVolume: " + volume + " cubic meters.\n";
    }
}