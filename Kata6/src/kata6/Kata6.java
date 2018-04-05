package kata6;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Kata6{

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        String nameFile = "/Users/QSM/NetBeansProjects/Kata6/src/data/emails";
        ArrayList<Person> mailArray = MailListReader.readFile(nameFile);
        ArrayList<Person1> lista = PersonLoader.read();

        HistogramBuilder<Person> builder = new HistogramBuilder(mailArray);
        HistogramBuilder<Person1> builder1 = new HistogramBuilder(lista);

        Histogram<String> domains = builder.build(new Attribute<Person, String>() {

            @Override
            public String get(Person item) {
                return item.getMail().split("@")[1];
            }
        });

        Histogram<Character> letters = builder.build(new Attribute<Person, Character>() {

            @Override
            public Character get(Person item) {
                return item.getMail().charAt(0);
            }
        });

        Histogram<String> domains1 = builder1.build(new Attribute<Person1, String>() {

            @Override
            public String get(Person1 item) {
                return item.getMail().split("@")[1];
            }
        });

        Histogram<Float> pesos = builder1.build(new Attribute<Person1, Float>() {

            @Override
            public Float get(Person1 item) {
                return item.getPeso();
            }
        });
        
        new HistogramDisplay(domains, "DOMINIOS").execute();
        new HistogramDisplay(letters, "CARACTER").execute();
        new HistogramDisplay(domains1, "DOMINIOS").execute();
        new HistogramDisplay(pesos, "PESOS").execute();
    }
}

