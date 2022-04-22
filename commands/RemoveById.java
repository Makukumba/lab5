package commands;


import Drago.Dragon;
import Managers.CollectionManager;
import exceptions.AmountException;
import exceptions.NotFoundException;

public class RemoveById extends AbstractCommand{
    private CollectionManager collectionManager;

    public RemoveById(CollectionManager collectionManager) {
        super("remove_by_id <ID>", "удалить элемент из коллекции по ID");
        this.collectionManager = collectionManager;
    }}