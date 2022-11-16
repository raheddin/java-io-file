package my.io.raheddin;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Part_9 {
    public static void main(String[] args) {
        String data="\n new Colum";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("raheddin.text");
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
            byte[] bytes=data.getBytes(StandardCharsets.UTF_8);
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
