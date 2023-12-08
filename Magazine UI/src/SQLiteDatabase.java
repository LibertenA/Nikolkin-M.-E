import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SQLiteDatabase {
    private static final String DATABASE_URL = "jdbc:sqlite:magazine.db";
    private Connection connection;
    private static final Logger logger = LoggerFactory.getLogger(SQLiteDatabase.class);

    public SQLiteDatabase() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(DATABASE_URL);
            createTables();
        } catch (SQLException e) {
            logger.error("Failed to establish a database connection", e);
        } catch (ClassNotFoundException e) {
            logger.error("SQLite JDBC driver not found", e);
        }
    }

    public void createTables() {
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

    public Connection getConnection() {
        return connection;
    }
}
