package my.io.raheddin;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Part_12 {
    /*Writer Sınıfı
    Java.io paketinin Writer sınıfı, bir karakter akışını temsil eden soyut bir üst sınıftır.
    Writer soyut bir sınıf olduğu için kendi başına kullanışlı değildir. Bununla birlikte, alt sınıfları veri yazmak için kullanılabilir.
    OutputStreamWriter
    Java.io paketinin OutputStreamWriter sınıfı, karakter biçimindeki verileri bayt biçimindeki verilere dönüştürmek için kullanılabilir. Writer soyut sınıfını genişletir.
    OutputStreamWriter sınıfı, diğer çıktı akışlarıyla çalışır. Bayt akışları ve karakter akışları arasında bir köprü olarak da bilinir. Bunun nedeni, OutputStreamWriter'ın karakterlerini bayta dönüştürmesidir.
    Örneğin, bazı karakterlerin depoda saklanması 2 bayt gerektirir. Bu tür verileri yazmak için,
    karakteri karşılık gelen baytlara dönüştüren ve baytları birlikte depolaması için OutputStreamWriter sınıfını kullanabiliriz.
    */

    public static void main(String[] args) {
        try {
            String data ="Rahəddin əıpöğçş";

            FileOutputStream fileOutputStream =new FileOutputStream("Barca.txt");

            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);

            System.out.println(outputStreamWriter.getEncoding());

            outputStreamWriter.write(data);

          //  fileOutputStream.close();
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
