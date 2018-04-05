package kata5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Kata5 {
       public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, SQLException{
        ArrayList<String> mailArray=MailListReaderDDBB.read();
        Histogram<String> histogram= new MailHistogramBuilder().build(mailArray);
        new HistogramDisplay(histogram).execute();
    }
}