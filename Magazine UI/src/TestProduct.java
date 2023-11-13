public class TestProduct implements java.io.Serializable {
    public static void main(String[] args) {
        ComparProduct comparProduct = new ComparProduct();
        new Thread(() -> new MainProductFrame(comparProduct).setVisible(true)).start();
    }
}
