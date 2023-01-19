package my.io.raheddin;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Part_9 {
    public static void main(String[] args) {
        String data = "\n new Colum";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("raheddin.text");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
BufferedOutputStream
Java.io paketinin BufferedOutputStream sınıfı,
verileri (bayt cinsinden) daha verimli yazmak için diğer çıktı akışlarıyla birlikte kullanılır. OutputStream soyut sınıfını genişletir.
BufferedOutputStream, 8192 baytlık bir dahili arabelleği korur. Yazma işlemi sırasında, baytlar disk yerine dahili tampona yazılır.
Tampon doldurulduktan veya akış kapatıldıktan sonra, tüm tampon diske yazılır. Böylelikle diskle iletişim sayısı azalır.
BufferedOutputStream kullanarak bayt yazmanın daha hızlı olmasının nedeni budur
*/
