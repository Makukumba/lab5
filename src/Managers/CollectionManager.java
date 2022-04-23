package Managers;

import java.util.TreeSet;

public class CollectionManager {
    private TreeSet<Dragon> dragon = new TreeSet<>();

    private FileManager fileManager;

    public CollectionManager(FileManager fileManager) {

        this.fileManager = fileManager;}}