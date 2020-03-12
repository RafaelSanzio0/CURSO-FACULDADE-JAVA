package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ManipulandoFiles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine(); //guarda o valor digitado pelo user

        try {
            File path = new File(strPath);
            File[] folders = path.listFiles(File::isDirectory); //pega o caminho que o user digitou
            // e verifica as pastas deste caminho

            System.out.println("FOLDERS:");
            for (File folder : folders) {
                System.out.println(folder);
            }

            File[] files = path.listFiles(File::isFile);
            System.out.println("FILES:");
            for (File file : files) {
                System.out.println(file);
            }

            boolean success = new File(strPath + "\\subdir").mkdir();
            System.out.println("Directory created successfully: " + success);
            sc.close();

        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
