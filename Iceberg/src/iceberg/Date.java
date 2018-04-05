package iceberg;

public class Date  {
    private final String day;
    private final String month;
    private final String year;

    public Date(final String day, final String month, final String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return "Date : " + day + "/" + month + "/" + year;
    }
    
    public int getYear() {
        return Integer.parseInt(year);
    }
}