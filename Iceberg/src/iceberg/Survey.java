package iceberg;
import java.util.HashMap;
import java.util.ArrayList;

public class Survey {
    private final HashMap<Date, ArrayList<Measure>> surveyData = new HashMap<>();
    
    public void addDataOnDate(Date date, Measure measure) {
        ArrayList<Measure> auxMeasure = new ArrayList<>();
        auxMeasure.add(measure);
         surveyData.put(date, auxMeasure);
    }
    
    public void addMultipleDataOnDate(Date date, ArrayList<Measure> measure) {
        surveyData.put(date, measure);
    }
    
    public String getInformation() {
        String data = "Multiple Data Survey\n";
         int count = 1;
        for (HashMap.Entry<Date, ArrayList<Measure>> entry : surveyData.entrySet()) {
            data +=  entry.getKey() + "\n";
            for (Measure i : entry.getValue()) {
                data += "Survey nº" + count + + "\n" + i  + " \n";
            }
            count = 1;
        }
        return data;
    }
}
