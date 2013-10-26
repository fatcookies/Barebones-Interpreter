package org.fc.barebones.interpreter.language.handlers;

import org.fc.barebones.interpreter.language.Statement;
import org.fc.barebones.interpreter.language.command.Command;
import org.fc.barebones.interpreter.language.command.WhileCommand;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: fc
 * Date: 25/10/13
 */
public class WhileCommandHandler extends BareboneHandler{
    @Override
    protected Pattern getPattern() {
        return Pattern.compile("^(while (.+) not 0 do;)|(end;)");
    }

    @Override
    public Command getCommand(Statement s) {
        Matcher m = getPattern().matcher(s.getLine());
        if(m.groupCount() >= 2) {
        return new WhileCommand("while");
        } else {
            return new WhileCommand("end");
        }
    }
}
