package my.io.raheddin;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Part_16 {
    /*BufferedWriter
    Java.io paketinin BufferedWriter sınıfı, verileri (karakter olarak) daha verimli yazmak için diğer yazarlarla birlikte kullanılabilir.
    Writer soyut sınıfını genişletir.
     */

    public static void main(String[] args) {
        String data = "Raxeddin Asadzade!" +
                "Test" +
                "esd";

        try {
            FileWriter fileWriter = new FileWriter("Yeni..txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

