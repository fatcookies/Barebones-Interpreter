package org.fc.barebones.interpreter.language;

/**
 * User: fc
 * Date: 25/10/13
 */
public class Statement {
    private String line;

    public Statement(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

}
