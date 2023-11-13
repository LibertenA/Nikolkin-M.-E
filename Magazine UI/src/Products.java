public class Products implements java.io.Serializable {
    private String name;
    private double price;
    private int count;
    public Products(){}
    public Products(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    @Override
    public String toString() {
        return String.format("Название: %s. Цена: %s. Количество: %s", name, price, count);
    }

}
