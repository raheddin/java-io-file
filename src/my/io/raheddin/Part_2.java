package my.io.raheddin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Part_2 {
    public static void main(String[] args) {

        /*
        InputStream Sınıfı => filedan melumatlari oxuyur
        InputStream sınıfı byte akışını temsil eden bir abstract sınıftır ve Java.io paketinden gelmektedir.
         */

        try {
            FileInputStream inputStream = new FileInputStream("raheddin.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("--------");

        try {
            File file = new File("raheddin.text");
            FileInputStream inputStream = new FileInputStream(file);
            int i = inputStream.read();
            while (i != -1) {
                System.out.print((char) i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("--------");

        try {
            File file = new File("raheddin.text");
            FileInputStream inputStream = new FileInputStream(file);
            System.out.println("karakter siize:"+inputStream.available());
            inputStream.read();
            inputStream.read();
            inputStream.read();
            System.out.println(inputStream.available());


            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("--------");

        try {
            File file = new File("raheddin.text");
            FileInputStream inputStream = new FileInputStream(file);
            inputStream.skip(10);//10 karakter atlayir
            int i = inputStream.read();
            while (i != -1) {
                System.out.print((char) i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
