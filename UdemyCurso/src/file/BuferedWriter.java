package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuferedWriter {
    public static void main(String[] args) {
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
        String path = "C:\\ESD\\out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine(); //quebra d linha
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
