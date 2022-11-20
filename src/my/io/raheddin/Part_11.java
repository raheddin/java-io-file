package my.io.raheddin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Part_11 {

    /*Reader Sınıfı Java.io paketinin Reader sınıfı, bir karakter akışını (Characters Stream) temsil eden soyut bir üst sınıftır.
    Reader soyut bir sınıf olduğu için kendi başına kullanışlı değildir. Bununla birlikte, alt sınıfları verileri okumak için kullanılabilir.
    InputStreamReader Sınıfı Java.io paketinin InputStreamReader sınıfı, bayt cinsinden verileri karakter cinsinden verilere dönüştürmek için kullanılabilir.
    Soyut Reader sınıfını genişletir. InputStreamReader sınıfı, diğer giriş akışlarıyla (Input Streams) çalışır. Bayt akışları ve karakter akışları arasında bir köprü olarak da bilinir.
    Bunun nedeni, InputStreamReader'ın giriş akışındaki baytları karakter olarak okumasıdır. Örneğin, bazı karakterlerin depoda depolanması için 2 bayt gerekiyordu.
    Bu tür verileri okumak için, 2 baytı birlikte okuyan ve karşılık gelen karaktere dönüştürmek için InputStreamReader sınıfını kullanabiliriz.
     */

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("Raxa.txt");
            int i=fileInputStream.read();
            while (i!=-1){
                System.out.print((char) i);
                i=fileInputStream.read();
            }

            fileInputStream.close();


            FileInputStream newFileInputStream = new FileInputStream("Raxa.txt");
            InputStreamReader inputStreamReader=new InputStreamReader(newFileInputStream, Charset.forName("UTF8"));
            int y=inputStreamReader.read();
            while (y!=-1){
                System.out.print((char) y);
                y=inputStreamReader.read();
            }

            newFileInputStream.close();
            inputStreamReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
