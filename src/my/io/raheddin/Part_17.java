package my.io.raheddin;

import java.io.PrintWriter;

public class Part_17 {
    /*PrintWriter
    Java.io paketinin PrintWriter sınıfı, çıktı verilerini yaygın olarak okunabilir bir biçimde (metin) yazmak için kullanılabilir. Writer soyut sınıfını genişletir.
    Diğer Writer sınıflarının aksine, PrintWriter ilkel verileri (int, float, char, vb.) Metin formatına dönüştürür. Daha sonra bu biçimlendirilmiş verileri Writer'a aktarır.
    Ayrıca, PrintWriter sınıfı herhangi bir girdi / çıktı istisnası (Exception) atmaz. Bunun yerine, içindeki herhangi bir hatayı bulmak için checkError() metodu kullanmamız gerekir.
         */

    public static void main(String[] args) {
        String data = "Raheddin Asazade Natiq Oglu.";
        try {
            PrintWriter output = new PrintWriter("output.txt");
            output.print(data);
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
