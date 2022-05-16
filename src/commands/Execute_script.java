package commands;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Execute_script extends AbstractCommand {

    private HashMap<String, Command> commands;

    public Execute_script(HashMap<String, Command> commands) {
        super("execute_script", "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме");
        this.commands = commands;
    }


    public void execute() throws IOException {
        String scriptFile = System.getenv("ScriptFile");

        FileReader reader = new FileReader(scriptFile);
        Scanner s = new Scanner(reader);


        System.out.println("Выполняем скрипт из файла");
        while (s.hasNext()) {
            String a = s.nextLine();

            for (Map.Entry<String, Command> command : commands.entrySet()) {
                if (a.equals(command.getKey())) {
                    command.getValue().execute();
                }
            }
        }
    }
}
