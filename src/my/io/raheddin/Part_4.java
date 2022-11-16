package my.io.raheddin;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Part_4 {
    public static void main(String[] args) {

        /*
        ByteArrayInputStream
        Java.io paketinin ByteArrayInputStream sınıfı, bir dizi girdi verisini (bayt cinsinden) okumak için kullanılabilir.
        ByteArrayInputStream'de, girdi akışı bayt dizisi kullanılarak oluşturulur. Bu bayt dizisinin verilerini depolamak için dahili bir dizi içerir.
        Bir bayt dizisi giriş akışı oluşturmak için, önce java.io.ByteArrayInputStream paketini içe aktarmalıyız.
         */

        byte[] dizi={123,2,3,4,5};
        ByteArrayInputStream inputStream=new ByteArrayInputStream(dizi);
        int i = inputStream.read();
        while (i != -1) {
            System.out.println(i);
            i = inputStream.read();
        }
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------");

        byte[] dizi2={123,2,3,4,5};
        ByteArrayInputStream inputStream2=new ByteArrayInputStream(dizi2);
        inputStream2.skip(2);
        int ii = inputStream2.read();
        while (ii != -1) {
            System.out.println(ii);
            ii = inputStream2.read();
        }
        try {
            inputStream2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------");

        byte[] dizi3={123,2,3,4,5};
        ByteArrayInputStream inputStream3=new ByteArrayInputStream(dizi3,1,2);
        inputStream3.skip(2);
        int i3 = inputStream3.read();
        while (i3 != -1) {
            System.out.println(i3);
            i3 = inputStream2.read();
        }
        try {
            inputStream3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
