import java.util.ArrayList;
import java.util.*;

public class ComparProduct implements java.io.Serializable {
    private ArrayList<Products> products = new ArrayList<>();

    public void add(Products product_service) {
        this.products.add(product_service);
    }

    public void setProducts(ArrayList<Products> products) {
        this.products = products;
    }

    public ArrayList<Products> getProducts() {
        return products;
    }

    public String show() {
        StringBuilder s = new StringBuilder();

        Iterator<Products> iter = this.products.iterator();
        while (iter.hasNext()) {
            s.append(iter.next()).append("\n");
        }
        return s.toString();
    }
}
