import java.io.*;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class History {
    private static final String fileName = "C:\\Users\\Михаил\\VSUET Java\\Tasks\\Task 50\\history.txt";
    public static void saveToHistory(String expression, double result) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append(expression);
            writer.append(" = ");
            writer.append(String.valueOf(result));
            writer.append("\n");
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении истории: " + e.getMessage());
        }
    }
    public static void deleteHistory(){
        try (RandomAccessFile writer = new RandomAccessFile(fileName, "rw")) {
            writer.setLength(0);
            }catch (IOException e) {
                e.printStackTrace();
            }
        System.out.println("История очищена");
    }

    public static List<String> loadHistory() {
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