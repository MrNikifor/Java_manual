package File.reading_date;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exampe1 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("Notes.txt");
             FileOutputStream fon = new FileOutputStream("Notes_new.txt")) {
            long finSize = fin.getChannel().size();
            byte[] buffer = new byte[(int) finSize];
            System.out.println("Fale date: ");

            int count;
            while ((count = fin.read(buffer)) != -1) {
                fon.write(buffer, 0, count);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
