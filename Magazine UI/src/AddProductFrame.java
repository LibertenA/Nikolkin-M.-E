import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddProductFrame extends JFrame {
    private JPanel mainProductPanel;
    private JTextField textFieldName;
    private JTextField textFieldPrice;
    private JTextField textFieldCount;
    private JButton backButton;
    private JButton okButton;
    private ComparProduct comparProduct;

    public AddProductFrame(ComparProduct comparProduct) {
        this.setContentPane(mainProductPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("Добавление продукта");
        this.comparProduct = comparProduct;
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddProductFrame.this.setVisible(false);
                new MainProductFrame(comparProduct).setVisible(true);
            }
        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    comparProduct.add(new Products(textFieldName.getText(),
                            Double.parseDouble(textFieldPrice.getText()),
                                    Integer.parseInt(textFieldCount.getText())));
                } catch (NumberFormatException ignored) {}
                AddProductFrame.this.setVisible(false);
                new MainProductFrame(comparProduct).setVisible(true);
            }
        });
    }
}
