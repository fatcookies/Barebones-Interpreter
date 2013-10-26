package org.fc.barebones.interpreter;

import org.fc.barebones.interpreter.language.Statement;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * User: fc
 * Date: 25/10/13
 */
public class Program {

    private ArrayList<Statement> lines;

    public Program(ArrayList<Statement> lines) {
        this.lines = lines;
    }

    public Iterator<Statement> iterator() {
        return lines.iterator();
    }


}
