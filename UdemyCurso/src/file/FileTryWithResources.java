package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTryWithResources {
    public static void main(String[] args) {
        String path = "C:\\ESD\\texto.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
FORMA VERBOSA - ANTES DO TRY WITH RESOURCES

    String path = "C:\\temp\\in.txt";
    BufferedReader br = null;
    FileReader fr = null;
    try {
        fr = new FileReader(path);
        br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
        System.out.println(line);
        line = br.readLine();
        }
    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }
     finally {
        try {
            if (br != null)
            br.close();
            if (fr != null)
            fr.close();
    } catch (IOException e) {
        e.printStackTrace();
        }
    }
 */