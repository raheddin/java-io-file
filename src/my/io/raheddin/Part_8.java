package my.io.raheddin;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Part_8 {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("raheddin.text");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = bufferedInputStream.read();
            while (i != -1) {
                System.out.print((char) i);
                i = bufferedInputStream.read();
            }
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
/*
BufferedInputStream
Java.io paketinin BufferedInputStream sınıfı,
verileri (bayt cinsinden) daha verimli okumak için diğer giriş akışlarıyla birlikte kullanılır. InputStream soyut sınıfını genişletir.
BufferedInputStream, 8192 baytlık bir dahili arabellek tutar.
BufferedInputStream'deki okuma işlemi sırasında, diskten bir bayt yığını okunur ve dahili tamponda saklanır.Ayrıca dahili arabellekten baytlar ayrı ayrı okunur.
Böylelikle diskle iletişim sayısı azalır. BufferedInputStream kullanarak bayt okumanın daha hızlı olmasının nedeni budur
*/
