public class Product {
    private String type;
    private int number;
    private String name;
    private int price;
    private int count;

    public Product(String type, int number, String name, int price, int count) {
        this.type = type;
        this.number = number;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Тип: " + type + ", Номер :" + number + ", Название: " + name + ", Цена: " + price + ", Кол-во: " + count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
