import java.io.IOException;
import Managers.*;
public class Main {
    public static void main(String[] args) throws IOException {
CommandManager cm = new CommandManager();
cm.read();
        Commander c = new Commander(cm);
        c.executee();
    }}




