package my.io.raheddin;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Part_3 {
    public static void main(String[] args) {

        /*
        FileOutputStream
        Java.io paketinin FileOutputStream sınıfı, dosyalara veri (bayt cinsinden) yazmak için kullanılabilir.
         */
        try {
            FileOutputStream outputStream =new FileOutputStream("rahddin.text");
            //eger file yoxdusa yaradacaq
            // ve bu formada olanda icindeki datani hemishe 0 layacaq
            FileOutputStream output =new FileOutputStream("rahddin.text",true);//bu ise olan datani silmeyecek
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String data="\n Raheddin Asadzade \n Barslona";
        try {
            FileOutputStream output =new FileOutputStream("raheddin.text",true);//bu ise olan datani silmeyecek
            byte[] bytes=data.getBytes(StandardCharsets.UTF_8);
            output.write(bytes);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
