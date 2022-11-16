package my.io.raheddin;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Part_8 {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream=new FileInputStream("raheddin.text");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
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
