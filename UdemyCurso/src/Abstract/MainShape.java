package Abstract;

import List.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainShape {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double aRect = 0;
        double aCircle = 0;
        List<Shape> shapes = new ArrayList<>();

        System.out.println("Enter the number of shapes");
        int shape = scanner.nextInt();

        for (int i = 1; i <= shape ; i++) {

            System.out.println("Shape #"+i+" data");
            System.out.println("Rect or Circle (R/C) ? ");
            String choose = scanner.next();
            System.out.println("COLOR: (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scanner.next());

            if(choose.equalsIgnoreCase("R")){
                System.out.println("Width: ");
                double w = scanner.nextDouble();
                System.out.println("Height: ");
                double h = scanner.nextDouble();
                shapes.add(new Rectangle(w,h));
            }else if(choose.equalsIgnoreCase("C")){
                System.out.println("Radius: ");
                double r = scanner.nextDouble();
                shapes.add(new Circle(r));
            }else{
                System.out.println("Enter option valid!!!");
                break;
            }
        }
        System.out.println("SHAPE AREAS");
        for (Shape s: shapes){
            if(s instanceof Circle){
                System.out.println("Circle AREA");
                System.out.println(s.area());
            }
            if(s instanceof Rectangle){
                System.out.println("Rect AREA");
                System.out.println(s.area());
            }
        }
        scanner.close();
    }
}
