package io.slc.sma;

public class Configuration
{
    private final int instructionSize;

    public Configuration(final int instructionSize)
    {
        this.instructionSize = instructionSize;
    }

    public int getInstructionSize()
    {
        return instructionSize;
    }
}