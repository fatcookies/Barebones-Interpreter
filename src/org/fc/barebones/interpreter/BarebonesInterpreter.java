package org.fc.barebones.interpreter;

import org.fc.barebones.interpreter.language.Block;
import org.fc.barebones.interpreter.language.Statement;
import org.fc.barebones.interpreter.language.Variable;
import org.fc.barebones.interpreter.language.handlers.*;

import java.util.HashMap;
import java.util.Iterator;

/**
 * User: fc
 * Date: 25/10/13
 */
public class BarebonesInterpreter {

    private BareboneHandler[] handlers = {
            new ClearCommandHandler(),
            new DecrCommandHandler(),
            new IncrCommandHandler(),
            new PrintCommandHandler(),
            new WhileCommandHandler()};


    private HashMap<String, Variable> variables;
    private Block mainBlock;

    public BarebonesInterpreter() {
        variables = new HashMap<String, Variable>();
    }

    public boolean execute(Program program) throws Exception {
        Iterator<Statement> it = program.iterator();
        while (it.hasNext()) {
            Statement currentLine = it.next();
            if(!execute(currentLine)) {
                throw new Exception("Unkown instruction:\n\""+currentLine.getLine()+"\"");
            }
        }
        return false;
    }

    private boolean execute(Statement statement) {

        for (BareboneHandler handle : handlers) {
            if (handle.matches(statement.getLine())) { // check if this command matches a handler
                handle.getCommand(statement).execute(this); // executes this comand
                return true;
            }
        }
        return false;
    }

    public void updateVariable(Variable value) {
        variables.put(value.getIdentifier(), value);
    }

    public Variable getVariable(String var) {
        return variables.get(var);
    }

}
