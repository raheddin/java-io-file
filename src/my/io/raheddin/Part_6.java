package my.io.raheddin;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Part_6 {
    public static void main(String[] args) {
        Car c = new Car("BMW", "M10");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("bmv.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(c);
            fileOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
