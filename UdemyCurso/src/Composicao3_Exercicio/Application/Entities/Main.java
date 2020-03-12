package Composicao3_Exercicio.Application.Entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import Enum.OrderStatus;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        Client client = new Client(name,email,birthDate);

        System.out.println("Enter order data");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order = new Order (new Date(),status,client);

        System.out.println("How many items to this order?: ");
        int manyItems = sc.nextInt();

        for (int i = 0; i < manyItems ; i++) {
            System.out.println("Enter #"+(i+1)+" item data:");

            System.out.print("Product name: ");
            name = sc.next();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            Product product = new Product(name,productPrice);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);

        }
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}