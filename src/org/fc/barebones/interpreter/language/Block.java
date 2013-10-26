package org.fc.barebones.interpreter.language;

import org.fc.barebones.interpreter.language.command.Command;

import java.util.ArrayList;

/**
 * User: fc
 * Date: 25/10/13
 */
public class Block {
    private ArrayList<Command> commands;
    private ArrayList<Block> nestedBlocks;

    public Block() {
        commands = new ArrayList<Command>();
        nestedBlocks = new ArrayList<Block>();
    }

    public boolean addStatement(Command cmd) {
        return commands.add(cmd);
    }

    public Block addBlock() {
        Block block = new Block();
        nestedBlocks.add(block);
        return block;
    }
}
