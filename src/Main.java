
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

import Drago.Dragon;
import Managers.*;
//import commands.*;
import Drago.DragonChecker;




public class Main {


    public static void main(String[] args)
          //  throws IOException
    {
    //    FileManager fileManager = new FileManager();
        //  TreeSet<Dragon> dragon = fileManager.read();
        /**
             CollectionManager collectionManager = new CollectionManager(Dragon);
        System.out.println("Добро пожаловать!");
        System.out.println("Напечатайте  help, чтобы начать");
        DragonChecker dragonChecker = new DragonChecker();
            CommandManager commandManager = new CommandManager(
                    new HelpCommand(),
                    new InfoCommand(collectionManager),
                    new ShowCommand(collectionManager),
                    new AddCommand(collectionManager),
                    new UpdateCommand(collectionManager, dragonChecker),
                    new RemoveByIdCommand(collectionManager),
                    new ClearCommand(collectionManager),
                    new SaveCommand(collectionManager),
                    new ExitCommand(),
                    new ExecuteScriptCommand(),
                    new PrintAscending(),
                    new PrintFieldDHead(),
                    new RemoveAnyByDD(collectionManager,dragonChecker);
                    new AddIfMaxCommand(collectionManager, dragonChecker);
                    new AddIfMinCommand(collectionManager, dragonChecker);
                    new RemoveLowerCommand(collectionManager, dragonChecker);
                    new HistoryCommand(),
            );
           ////.....
    } */
        Parser parser = new Parser();
        ParseHelper helper = parser.parse();
        System.out.println(helper.toString());
}}