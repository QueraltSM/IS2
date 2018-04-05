package Kata3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        String pathName = "/Users/QSM/NetBeansProjects/Kata3/src/data/emails.txt";
        
        try {
            BufferedReader fileIn = new BufferedReader(new FileReader(pathName));
            String mail;
            
            while((mail = fileIn.readLine()) != null) {
               if (mail.contains("@"))
                   histogram.increment(mail.split("@")[1].toLowerCase());
            }

        } catch(Exception e){
            System.out.println("File does not exist.");
        }
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
}