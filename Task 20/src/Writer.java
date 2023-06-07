import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public Writer(Matrix matrix){
        try(FileWriter writer = new FileWriter("T20.txt")){
            writer.write(String.valueOf(matrix));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
