package org.fc.barebones.interpreter;

import org.fc.barebones.interpreter.language.Statement;
import org.fc.barebones.interpreter.language.command.Command;

import java.util.regex.Pattern;

/**
 * Date: 25/10/13
 * Time: 17:57
 */
public class Parser {


    public static final Pattern[] COMMAND_PATTERNS = {
            Pattern.compile("^clear (.+);"),
            Pattern.compile("^incr (.+);"),
            Pattern.compile("^decr (.+);"),
            Pattern.compile("^(while (.+) not (\\d) do)|(end);")};


    public static Command parse(Statement s) {
        return null;
    }
}
