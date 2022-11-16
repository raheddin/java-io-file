package my.io.raheddin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Part_7 {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("bmv.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Car car = (Car) objectInputStream.readObject();
            System.out.println(car.getBrand());
            System.out.println(car.getModel());
            inputStream.close();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
