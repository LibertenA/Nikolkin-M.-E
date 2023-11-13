import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class MainProductFrame extends JFrame {
    private JPanel mainProductPanel;
    private JButton showProductCollection;
    private JButton productButton;
    private JButton saveProduct;
    private JButton loadProduct;


    public MainProductFrame(ComparProduct comparProduct) {
        this.setContentPane(mainProductPanel);
        this.setTitle("Газетный киоск");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        showProductCollection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ShowProductFrame(comparProduct).setVisible(true);
                MainProductFrame.this.setVisible(false);
            }
        });
        productButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddProductFrame(comparProduct).setVisible(true);
                MainProductFrame.this.setVisible(false);
            }
        });
        saveProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Saving(comparProduct);
                SavingByte(comparProduct);
            }
        });
        loadProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comparProduct.getProducts().clear();
                LoadingByte(comparProduct);
            }
        });
    }

    public static void Saving(ComparProduct comparProduct) {
        try{
            FileWriter writer = new FileWriter("magazine.txt");
            writer.write(comparProduct.show());
            writer.close();
            System.out.println("Данные обновлены");
        } catch (IOException e) {
            System.out.println("Ошибка");
            e.printStackTrace();
        }
    }

    public static ComparProduct LoadingByte(ComparProduct comparProduct) {
        ObjectInputStream in;
        try {
            in = new ObjectInputStream(new BufferedInputStream(
                    new FileInputStream("text.txt")
            ));
            try {
                comparProduct.setProducts((ArrayList<Products>)in.readObject());
            } catch (IOException e) {
                System.out.println("Maybe disk is full, or you haven't permissions to write");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (FileNotFoundException e) {
                System.out.println("Ошибка");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Отсутсвует файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return comparProduct;
    }

    public static void SavingByte(ComparProduct comparProduct) {
        ObjectOutputStream out;
        try {
            out = new ObjectOutputStream(new BufferedOutputStream(
                    new FileOutputStream("text.txt")
            ));
            try {
                out.writeObject(comparProduct.getProducts());
            } catch (IOException e) {
                System.out.println("Maybe disk is full, or you haven't permissions to write");
            }
            try {
                out.close();
            } catch (IOException e) {
                System.out.println("Ошибка");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Отсутствует файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
