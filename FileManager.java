package Managers;
import com.google.gson.Gson;
public class FileManager {
    private String E;
    private Gson gson = new Gson();
    public FileManager(String e) {
        this.E = e;
    }
}
