package my.io.raheddin;

import java.io.FileWriter;
import java.io.IOException;

public class Part_14 {
    /*FileWriter
Java.io paketinin FileWriter sınıfı, dosyalara (karakter olarak) veri yazmak için kullanılabilir. OutputStreamWriter sınıfını genişletir.
     */
    public static void main(String[] args) {
        try {
            String data = "Rahəddin ıəpöğçş";
            FileWriter fileWriter = new FileWriter("Yeni..txt");
            fileWriter.write(data);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
