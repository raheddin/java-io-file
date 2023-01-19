package my.io.raheddin;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Part_13 {
    /*FileReader
     Java.io paketinin FileReader sınıfı, dosyalardan verileri (karakter olarak) okumak için kullanılabilir. InputStreamReader sınıfını genişletir.
     */
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("Raxa.txt");
            int i = fileReader.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fileReader.read();
            }
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
