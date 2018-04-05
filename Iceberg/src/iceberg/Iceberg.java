package iceberg;
import java.util.ArrayList; 

public class Iceberg {
    private final Survey survey = new Survey();

    public Iceberg () {}

    public void setMeasureOnDate(final Date date, final Position position, final Volume volume) {
        survey.addDataOnDate(date, new Measure(position, volume));
    }
    
    public void setMultipleMeasureOnDate(final Date date, ArrayList<Measure> measure) {
        survey.addMultipleDataOnDate(date, measure);
    }
    
    public String getSurveys() {
        return survey.getInformation();
    }
}