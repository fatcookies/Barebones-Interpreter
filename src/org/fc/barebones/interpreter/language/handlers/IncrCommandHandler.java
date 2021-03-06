package org.fc.barebones.interpreter.language.handlers;

import org.fc.barebones.interpreter.language.Statement;
import org.fc.barebones.interpreter.language.command.ClearCommand;
import org.fc.barebones.interpreter.language.command.Command;
import org.fc.barebones.interpreter.language.command.IncrCommand;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: fc
 * Date: 25/10/13
 */
public class IncrCommandHandler extends BareboneHandler{
    @Override
    protected Pattern getPattern() {
        return Pattern.compile("^incr (.+);");
    }

    @Override
    public Command getCommand(Statement s) {
        Matcher m = getPattern().matcher(s.getLine());
        if(m.matches()) {
            return new IncrCommand(m.group(1));
        }
        return null;
    }
}
