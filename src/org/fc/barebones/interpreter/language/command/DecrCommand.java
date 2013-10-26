package org.fc.barebones.interpreter.language.command;

import org.fc.barebones.interpreter.BarebonesInterpreter;
import org.fc.barebones.interpreter.language.Variable;

/**
 * User: fc
 * Date: 25/10/13
 */
public class DecrCommand extends Command {

    public DecrCommand(String param) {
        super(param);
    }

    @Override
    public boolean execute(BarebonesInterpreter b) {
        //System.out.println(getFirstParameter()+"--");

        // get the value of the variable and do the actual operation decr
        Variable var = b.getVariable(getFirstParameter());
        int i = (Integer) var.getValue();
        i--;
        var.setValue(i);

        b.updateVariable(var);
        return true;
    }

    @Override
    public String getName() {
        return "decr";
    }

}
