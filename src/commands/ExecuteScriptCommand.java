package commands;
import Managers.CollectionManager;
import Drago.DragonChecker;
public abstract class ExecuteScriptCommand extends AbstractCommand{

    public ExecuteScriptCommand(CollectionManager collectionManager, DragonChecker dragonChecker) {
        super("execute_script file_name ", "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме."
        );
    }}