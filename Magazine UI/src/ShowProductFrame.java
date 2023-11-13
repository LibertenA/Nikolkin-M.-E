import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowProductFrame extends JFrame {
    private JPanel mainProductPanel;
    private JButton okProductButton;
    private JTextArea showTextProductArea;

    public ShowProductFrame(ComparProduct comparProduct) {
        this.setContentPane(mainProductPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("Товары");
        showTextProductArea.setEditable(false);
        showTextProductArea.setText(comparProduct.show());
        okProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowProductFrame.this.setVisible(false);
                new MainProductFrame(comparProduct).setVisible(true);
            }
        });
    }
}
