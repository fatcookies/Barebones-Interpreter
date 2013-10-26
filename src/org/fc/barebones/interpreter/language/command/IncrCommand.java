package org.fc.barebones.interpreter.language.command;

import org.fc.barebones.interpreter.BarebonesInterpreter;
import org.fc.barebones.interpreter.language.Variable;

/**
 * User: fc
 * Date: 25/10/13
 */
public class IncrCommand extends Command {

    public IncrCommand(String param) {
        super(param);
    }

    @Override
    public boolean execute(BarebonesInterpreter b) {
        //System.out.println(getFirstParameter()+"++");

        Variable var = b.getVariable(getFirstParameter());
        int i = (Integer) var.getValue();
        i++;
        var.setValue(i);

        b.updateVariable(var);
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getName() {
        return "incr";
    }

}
