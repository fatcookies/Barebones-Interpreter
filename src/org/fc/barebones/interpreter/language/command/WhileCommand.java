package org.fc.barebones.interpreter.language.command;

import org.fc.barebones.interpreter.BarebonesInterpreter;

/**
 * User: fc
 * Date: 25/10/13
 */
public class WhileCommand extends Command{


    public WhileCommand(String param) {
        super(param);
    }

    @Override
    public boolean execute(BarebonesInterpreter b) {
        System.out.println("while "+getFirstParameter());
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getName() {
        return "while";
    }
}
