package my.io.raheddin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Part_15 {
    /*BufferedReader
    Java.io paketinin BufferedReader sınıfı, verileri (karakter olarak) daha verimli okumak için diğer okuyucularla birlikte kullanılabilir.
    Soyut Reader sınıfını genişletir.
    BufferedReader, 8192 karakterlik bir dahili arabellek tutar. BufferedReader'daki okuma işlemi sırasında, diskten bir yığın karakter okunur ve
    dahili tamponda saklanır ve dahili tampondan karakterler ayrı ayrı okunur. Böylelikle diskle iletişim sayısı azalır. BufferedReader kullanarak karakterleri okumak daha hızlı olmasının nedeni budur.
     */

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Raxa.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
