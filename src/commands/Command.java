package commands;

import java.io.IOException;

public interface Command {
    String getDescription();
    String getName();
    void execute() throws IOException;
}