package org.fc.barebones.interpreter.language;

/**
 * User: fc
 * Date: 25/10/13
 */
public class Variable<T> {

    private String identifier;
    private T value;

    public Variable(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        if (value != null) {
            this.value = value;
        }
    }


}
