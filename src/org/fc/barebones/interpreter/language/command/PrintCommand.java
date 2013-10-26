package org.fc.barebones.interpreter.language.command;

import org.fc.barebones.interpreter.BarebonesInterpreter;
import org.fc.barebones.interpreter.language.Variable;

/**
 * Created with IntelliJ IDEA.
 * User: fc
 * Date: 25/10/13
 * Time: 19:51
 * To change this template use File | Settings | File Templates.
 */
public class PrintCommand extends Command {

    public PrintCommand(String param) {
        super(param);
    }

    @Override
    public boolean execute(BarebonesInterpreter b) {
        //System.out.println("print "+getFirstParameter());
        Variable var = b.getVariable(getFirstParameter());
        int i = (Integer) var.getValue(); // for now assume all variables are integers

        System.out.println(i);
        return false;
    }

    @Override
    public String getName() {
        return "print";
    }
}
