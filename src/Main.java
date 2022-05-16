import java.io.IOException;

import Managers.*;


public class Main {
    public static void main(String[] args) {
        CommandManager cm = new CommandManager();
        cm.read();
        Commander c = new Commander(cm);
        try {
            c.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




