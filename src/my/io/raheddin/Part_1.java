package my.io.raheddin;

import java.io.File;
import java.io.IOException;

public class Part_1 {
    public static void main(String[] args) {
        //Create File
        File file1 = new File("raheddin.text");
        try {
            System.out.println(file1.createNewFile());
            System.out.println(file1.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }


        File file2 = new File("src/raheddin.text");
        try {
            System.out.println(file2.createNewFile());
            System.out.println(file2.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Delete File
        System.out.println(file2.delete());

        //Create Packet than file
        File file3 = new File("test");
        System.out.println(file3.mkdir());//yalniz bir papka yaradir
        try {
            File file4 = new File("test/raheddin.txt");
            System.out.println(file4.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file5 = new File("raheddin/rah/test");
        System.out.println(file5.mkdirs());//create 2 paket raheddin and rah than test


        //listFile
        File file6 = new File("raheddin");
        String list[] = file6.list();
        for (String e :
                list) {
            System.out.println(e);
        }

    }
}
