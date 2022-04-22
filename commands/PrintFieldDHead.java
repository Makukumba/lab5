package commands;
import Drago.Dragon;
import exceptions.*;
import Managers.CollectionManager;
import Drago.DragonChecker;
public class PrintFieldDHead extends AbstractCommand{
    private CollectionManager collectionManager;
    private DragonChecker dragonChecker;

    public PrintFieldDHead(CollectionManager collectionManager, DragonChecker dragonChecker) {
        super("print_field_descending_head", "вывести значения поля head всех элементов в порядке убывания");
        this.collectionManager = collectionManager;
        this.dragonChecker = dragonChecker;
    }}