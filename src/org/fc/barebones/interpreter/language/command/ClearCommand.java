package org.fc.barebones.interpreter.language.command;

import org.fc.barebones.interpreter.BarebonesInterpreter;
import org.fc.barebones.interpreter.language.Variable;

/**
 * User: fc
 * Date: 25/10/13
 */
public class ClearCommand extends Command {

    public ClearCommand(String param) {
        super(param);
    }

    @Override
    public boolean execute(BarebonesInterpreter b) {
        //System.out.println(getFirstParameter()+" = 0");

        Variable zero = new Variable(getFirstParameter());
        zero.setValue(0);

        b.updateVariable(zero); // creates/overwrites variable with
        return false;
    }

    @Override
    public String getName() {
        return "clear";
    }


}
