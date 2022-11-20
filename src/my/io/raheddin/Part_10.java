package my.io.raheddin;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Part_10 {
    /* PrintStream
     Java.io paketinin PrintStream sınıfı, çıktı verilerini bayt yerine yaygın olarak okunabilir biçimde (metin) yazmak için kullanılabilir.
     Soyut OutputStream sınıfını genişletir.
     Diğer çıktı akışlarından farklı olarak, PrintStream ilkel verileri (tamsayı, karakter) bayt yerine metin biçimine dönüştürür.
     Daha sonra bu biçimlendirilmiş verileri çıktı akışına yazar.
     Ayrıca, PrintStream sınıfı herhangi bir girdi / çıktı istisnası (exception) atmaz.
     Bunun yerine, içindeki herhangi bir hatayı bulmak için checkError() metodunu kullanmamız gerekir.*/
    public static void main(String[] args) {
        try {
            PrintStream stream=new PrintStream("Raxa.txt");
            stream.println(123+2+"Raheddin");
            stream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
