package org.fc.barebones.interpreter.language.command;

import org.fc.barebones.interpreter.BarebonesInterpreter;

import java.util.ArrayList;

/**
 * User: fc
 * Date: 25/10/13
 */
public abstract class Command {

    private ArrayList<String> parameters;

    public abstract boolean execute(BarebonesInterpreter b);

    public abstract String getName();

    public Command(String param) {
        parameters = new ArrayList<String>();
        parameters.add(param);
    }

    public Command(ArrayList<String> parameters) {
        this.parameters = parameters;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }

    public String getFirstParameter() {
        if (parameters.size() > 0) {
            return parameters.get(0);
        }
        return null; // There might not be any params!
    }

}
