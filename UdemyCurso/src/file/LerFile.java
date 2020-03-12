package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerFile {
    public static void main(String[] args) {
            File file = new File("C:\\ESD\\texto.txt");
            Scanner sc = null;
            try {
                sc = new Scanner(file);
                while (sc.hasNextLine()) { // verifica se tem a proxima linha
                    System.out.println(sc.nextLine()); // imprime a linha
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                if (sc != null) {
                    sc.close();
                }
            }
        }
    }