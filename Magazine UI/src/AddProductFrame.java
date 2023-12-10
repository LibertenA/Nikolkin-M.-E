import javax.swing.*;

public class AddProductFrame extends JFrame {
    private JPanel mainProductPanel;
    private JTextField textFieldName;
    private JTextField textFieldPrice;
    private JTextField textFieldCount;
    private JButton backButton;
    private JButton okButton;
    private JTextField textFieldNumber;
    private JComboBox comboBoxType;

    public AddProductFrame(ShowProductFrame showProductFrame) {
        this.setContentPane(mainProductPanel);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("Добавление продукта");

        backButton.addActionListener(e -> {
            AddProductFrame.this.setVisible(false);
            showProductFrame.revalidate();
            showProductFrame.repaint();
            showProductFrame.setVisible(true);
        });

        okButton.addActionListener(e -> {
            try {
                showProductFrame.getMagazine().addProduct(new Product(
                        comboBoxType.getSelectedItem().toString(), Integer.parseInt(textFieldNumber.getText()),
                        textFieldName.getText(), Integer.parseInt(textFieldPrice.getText()),
                        Integer.parseInt(textFieldCount.getText())
                ));
                AddProductFrame.this.setVisible(false);
                showProductFrame.revalidate();
                showProductFrame.repaint();
                showProductFrame.setVisible(true);
            } catch (NumberFormatException ignored) {}
        });
    }

    public AddProductFrame(ShowProductFrame showProductFrame, Product product) {
        this(showProductFrame);
        comboBoxType.setSelectedItem(product.getType());
        textFieldNumber.setText(Integer.toString(product.getNumber()));
        textFieldName.setText(product.getName());
        textFieldPrice.setText(Integer.toString(product.getPrice()));
        textFieldCount.setText(Integer.toString(product.getCount()));
    }
}
