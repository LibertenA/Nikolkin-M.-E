import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowProductFrame extends JFrame {
    private JPanel mainProductPanel;
    private JPanel productsPanel;
    private JButton addProductBtn;
    private final Magazine magazine;

    public ShowProductFrame() {
        this.setContentPane(mainProductPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 700);
        this.setTitle("Товары");

        SQLiteDatabase db = new SQLiteDatabase();
        magazine = new Magazine(db);

        productsPanel.setLayout(new BoxLayout(productsPanel, BoxLayout.Y_AXIS));
        for (Product product : magazine.getAllProducts()) {
            productsPanel.add(new ProductPanel(product));
        }

        addProductBtn.addActionListener(e -> {
            ShowProductFrame.this.setVisible(false);
            new AddProductFrame(ShowProductFrame.this).setVisible(true);
        });
    }

    @Override
    public void repaint() {
        super.repaint();

        productsPanel.removeAll();
        for (Product product : magazine.getAllProducts()) {
            productsPanel.add(new ProductPanel(product));
        }
    }

    private class ProductPanel extends JPanel {
        public ProductPanel(Product product) {
            JTextArea info = new JTextArea(product.toString());
            add(info);

            JButton editBtn = new JButton("Редактировать");
            editBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ShowProductFrame.this.setVisible(false);
                    new AddProductFrame(ShowProductFrame.this, product).setVisible(true);
                }
            });
            add(editBtn);

            Font font = new Font(getFont().getName(), getFont().getStyle(), 18);

            SpinnerNumberModel countSpinnerModel = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
            JSpinner countSpinner = new JSpinner(countSpinnerModel);
            countSpinner.setFont(font);

            JButton minusBtn = new JButton("-");
            minusBtn.addActionListener(e -> {
                magazine.editProduct(
                        product.getType(), product.getNumber(), product.getName(),
                        product.getPrice(), product.getCount() - (Integer) countSpinner.getValue()
                );
                ShowProductFrame.this.repaint();
                ShowProductFrame.this.revalidate();
            });
            minusBtn.setBackground(Color.RED);
            minusBtn.setFont(font);
            add(minusBtn);

            add(countSpinner);

            JButton plusBtn = new JButton("+");
            plusBtn.addActionListener(e -> {
                magazine.editProduct(
                        product.getType(), product.getNumber(), product.getName(),
                        product.getPrice(), product.getCount() + (Integer) countSpinner.getValue()
                );
                ShowProductFrame.this.repaint();
                ShowProductFrame.this.revalidate();
            });
            plusBtn.setBackground(Color.GREEN);
            plusBtn.setFont(font);
            add(plusBtn);
        }
    }

    public Magazine getMagazine() {
        return magazine;
    }
}
