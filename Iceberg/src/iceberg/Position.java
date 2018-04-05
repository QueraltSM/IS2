package iceberg;

public class Position {
    private final String latitude ;
    private final String longitude;

    public Position(final String latitude, final String longitude) {
        this.latitude =  latitude;
        this.longitude = longitude;
    }

    public String toString() {
        return "Latitude: " + latitude  + "  Longitude: " + longitude;
    }
}