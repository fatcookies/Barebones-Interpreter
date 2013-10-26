package org.fc.barebones.interpreter.language.handlers;

import org.fc.barebones.interpreter.language.Statement;
import org.fc.barebones.interpreter.language.command.Command;

import java.util.regex.Pattern;

/**
 * User: fc
 * Date: 25/10/13
 */
public abstract class BareboneHandler {

    protected abstract Pattern getPattern();
    public abstract Command getCommand(Statement s);

    public boolean matches(String input) {
        return getPattern().matcher(input).matches();
    }

}
