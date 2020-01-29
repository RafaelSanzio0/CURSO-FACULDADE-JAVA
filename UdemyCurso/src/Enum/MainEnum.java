package Enum;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Date;

public class MainEnum {
    public static void main(String[] args) {
        Order order = new Order(12,new Date(),OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        //convertendo String para enum
        //e preciso pois o usuario vai entrar com o valor como String num formulario por exemplo
        OrderStatus orderStatus = OrderStatus.DELIVERED;
        OrderStatus orderStatus2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(orderStatus.getValor());
        System.out.println(orderStatus2);

    }
}
