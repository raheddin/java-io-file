package my.io.raheddin;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Part_5 {
    public static void main(String[] args) {
        String data = "Raheddin Asadzade Natiq Oglu";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
        String ss = bytes.toString();
        System.out.println(ss);
        try {
            outputStream.write(bytes);
            System.out.println(outputStream.toString());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
