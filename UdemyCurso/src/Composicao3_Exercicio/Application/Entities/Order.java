package Composicao3_Exercicio.Application.Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enum.OrderStatus;

public class Order {
    private Date moment;
    private OrderStatus status;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    List<OrderItem> OrderItems = new ArrayList<>();
    private Client client;

    public Order(Date moment,OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item){
        OrderItems.add(item);
    }

    public void removeItem(OrderItem item){
        OrderItems.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item : OrderItems) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : OrderItems) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
