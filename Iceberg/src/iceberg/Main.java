package iceberg;
import java.util.ArrayList;

public class Main {
    private static final Iceberg iceberg = new Iceberg();
    
    public static void main(String[] args) {
        iceberg.setMeasureOnDate(new Date("02", "04", "1997"),
                new Position("-234", "-126"), new Volume("15642561"));
        iceberg.setMeasureOnDate(new Date("03","04","1998"), new Position("-234", "-126"), new Volume("1212123"));
        
        ArrayList<Measure> multipleData = new ArrayList<>();
        multipleData.add(new Measure(new Position("123", "-123"), new Volume("121232353")));
        multipleData.add(new Measure(new Position("-121", "-121"), new Volume("121214343")));
        multipleData.add(new Measure(new Position("52", "143"), new Volume("623524")));
        
        iceberg.setMultipleMeasureOnDate(new Date("26", "10", "1999"), multipleData);
    }
}