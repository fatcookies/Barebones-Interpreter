package org.fc.barebones.interpreter;

import org.fc.barebones.interpreter.language.Statement;

import java.util.ArrayList;

/**
 * User: fc
 * Date: 25/10/13
 */
public class Main {

    public static void main(String[] args) {
        Program p = new Program(new ArrayList<Statement>() {{
            add(new Statement("clear a;"));
            add(new Statement("incr a;"));
            add(new Statement("incr a;"));
            add(new Statement("incr a;"));
            add(new Statement("print a;"));
            //add(new Statement("while emo not 0 do;"));
            add(new Statement("decr a;"));
            add(new Statement("print a;"));
            //add(new Statement("end;"));
        }});

        BarebonesInterpreter bb = new BarebonesInterpreter();

        try {
            bb.execute(p);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
