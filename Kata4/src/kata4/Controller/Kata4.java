package kata4.Controller;
import java.io.IOException;
import java.util.ArrayList;
import kata4.Model.Histogram;
import kata4.View.HistogramDisplay;
import kata4.View.MailHistogramBuilder;
import kata4.View.MailListReader;

public class Kata4 {
    public static void main(String[] args) throws IOException {
        String nameFile = "/Users/QSM/NetBeansProjects/Kata4/src/kata4/Data/emails.txt";
        ArrayList<String> mailArray = MailListReader.read(nameFile);
        Histogram<String> histo = MailHistogramBuilder.build(mailArray);
        new HistogramDisplay(histo).execute();
    }
}