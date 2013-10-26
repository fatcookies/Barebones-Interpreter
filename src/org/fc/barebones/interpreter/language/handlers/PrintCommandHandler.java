package org.fc.barebones.interpreter.language.handlers;

import org.fc.barebones.interpreter.language.Statement;
import org.fc.barebones.interpreter.language.command.ClearCommand;
import org.fc.barebones.interpreter.language.command.Command;
import org.fc.barebones.interpreter.language.command.PrintCommand;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: fc
 * Date: 25/10/13
 */
public class PrintCommandHandler extends BareboneHandler{

    protected Pattern getPattern() {
        return Pattern.compile("^print (.+);");
    }

    @Override
    public Command getCommand(Statement s) {
        Matcher m = getPattern().matcher(s.getLine());
        if(m.matches()) {
            return new PrintCommand(m.group(1));
        }
        return null;
    }
}
