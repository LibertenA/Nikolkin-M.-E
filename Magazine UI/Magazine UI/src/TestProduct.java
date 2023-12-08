public class TestProduct implements java.io.Serializable {
    public static void main(String[] args) {
        new Thread(() -> new ShowProductFrame().setVisible(true)).start();
    }
}
