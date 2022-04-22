
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

import commands.AddCommand;
import commands.AddIfMinCommand;
import commands.ClearCommand;
import commands.ExecuteScriptCommand;
import commands.ExitCommand;
import commands.FilterByWeaponTypeCommand;
import commands.HelpCommand;
import commands.HistoryCommand;
import commands.InfoCommand;
import commands.MaxByMeleeWeaponCommand;
import commands.RemoveByIdCommand;
import commands.RemoveGreaterCommand;
import commands.SaveCommand;
import commands.ShowCommand;
import commands.SumOfHealthCommand;
import commands.UpdateCommand;
import utility.CollectionManager;
import utility.CommandManager;
import utility.Console;
import utility.FileManager;
import utility.MarineAsker;




public class Main {
    public static void main(String[] args) throws IOException {
        FileM fileM = new FileM();

        TreeSet<Dragon> organization = fileM.read();

        CollectionManager collectionManager = new CollectionManager(Dragon);
        System.out.println("Добро пожаловать!");
        System.out.println("Напечатайте  help, чтобы начать");
        //InputChecker inputChecker = new InputChecker();
        DragonChecker dragonChecker = new DragonChecker();
            CommandManager commandManager = new CommandManager(
                    new HelpCommand(),
                    new InfoCommand(collectionManager),
                    new ShowCommand(collectionManager),
                    new AddCommand(collectionManager),
                    new UpdateCommand(collectionManager, marineAsker),
                    new RemoveByIdCommand(collectionManager),
                    new ClearCommand(collectionManager),
                    new SaveCommand(collectionManager),
                    new ExitCommand(),
                    new ExecuteScriptCommand(),
                    new AddIfMinCommand(collectionManager, marineAsker),
                    new RemoveGreaterCommand(collectionManager, marineAsker),
                    new HistoryCommand(),
                    new SumOfHealthCommand(collectionManager),
                    new MaxByMeleeWeaponCommand(collectionManager),
                    new FilterByWeaponTypeCommand(collectionManager)
            );
            Console console = new Console(commandManager, userScanner);

            console.interactiveMode();
        }
    }
}