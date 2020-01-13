package OO;

public class Product {
    private String nome;
    private double price;
    private int quantity;

    public Product(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome='" + nome + '\'' +
                ", price=" + String.format("%.2f",price).replace(",",".") +
                ", quantity=" + quantity +
                " totalStock=" +  String.format("%.2f",totalValueInStock()).replace(",",".") +
                '}';
    }

    public double totalValueInStock(){
        return price*quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

