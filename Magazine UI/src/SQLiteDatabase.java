import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SQLiteDatabase {
    private static final String DATABASE_URL = "jdbc:sqlite:magazine.db";
    private static Connection connection;
    private static final Logger logger = LoggerFactory.getLogger(SQLiteDatabase.class);

    static {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(DATABASE_URL);
            createTables();
            System.out.println("connection opened");
        } catch (SQLException e) {
            logger.error("Failed to establish a database connection", e);
        } catch (ClassNotFoundException e) {
            logger.error("SQLite JDBC driver not found", e);
        }
    }

    public static void createTables() {
        try {
            String createProductsTable = "CREATE TABLE IF NOT EXISTS products (" +
                    "type TEXT, " +
                    "number INTEGER, " +
                    "name TEXT, " +
                    "price INTEGER, " +
                    "count INTEGER, " +
                    "PRIMARY KEY (type, number)" +
                    ");";
            connection.createStatement().executeUpdate(createProductsTable);

            logger.info("Database tables created successfully");
        } catch (SQLException e) {
            logger.error("Failed to create database tables", e);
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null) connection.close();
            System.out.println("connection closed");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
