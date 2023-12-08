import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private final Connection connection;

    public Magazine(SQLiteDatabase db) {
        this.connection = db.getConnection();
    }

    public void addProduct(Product product) {
        Product existedProduct = null;
        if ((existedProduct = getProductByTypeAndNumber(product.getType(), product.getNumber())) != null) {
            editProduct(
                    product.getType(), product.getNumber(), product.getName(),
                    product.getPrice(), product.getCount()
            );
            return;
        }

        String addProduct = "INSERT INTO products VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(addProduct)) {
            preparedStatement.setString(1, product.getType());
            preparedStatement.setInt(2, product.getNumber());
            preparedStatement.setString(3, product.getName());
            preparedStatement.setInt(4, product.getPrice());
            preparedStatement.setInt(5, product.getCount());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            handleSQLException(e);
        }
    }

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        String selectAllProducts = "SELECT * FROM products;";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectAllProducts)) {
            while (resultSet.next()) {
                String type = resultSet.getString("type");
                int number = resultSet.getInt("number");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int count = resultSet.getInt("count");

                products.add(new Product(type, number, name, price, count));
            }
        } catch (SQLException e) {
            handleSQLException(e);
        }

        return products;
    }

    public Product getProductByTypeAndNumber(String type, int number) {
        String selectProductByTypeAndNumber = "SELECT * FROM products WHERE type = '" + type + "' AND number = '" + number + "';";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectProductByTypeAndNumber)) {
            if (resultSet.next()) {
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int count = resultSet.getInt("count");

                return new Product(type, number, name, price, count);
            }
        } catch (SQLException e) {
            handleSQLException(e);
        }

        return null;
    }

    public void editProduct(String type, int number, String name, int price, int count) {
        String editProduct = "UPDATE products SET name = ?, price = ?, count = ? WHERE type = ? AND number = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(editProduct)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, price);
            preparedStatement.setInt(3, count);
            preparedStatement.setString(4, type);
            preparedStatement.setInt(5, number);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            handleSQLException(e);
        }
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            handleSQLException(e);
        }
    }

    private void handleSQLException(SQLException e) {
        System.err.println("Error executing SQL query: " + e.getMessage());
        e.printStackTrace();
    }
}
