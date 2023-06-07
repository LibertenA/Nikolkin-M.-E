import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class History {
    private static final String fileName = "C:\\Users\\Михаил\\VSUET Java\\Tasks\\Task 50\\history.csv";
    public void saveExpression(String expression, double result) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append(expression);
            writer.append(",");
            writer.append(String.valueOf(result));
            writer.append("\n");
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении истории: " + e.getMessage());
        }
    }
    public List<String> loadHistory() {
        List<String> history = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                history.add(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при загрузке истории: " + e.getMessage());
        }
        return history;
    }
}