package io.slc.jsm.defaultruntime;

// import java.util.Map;
// import java.util.HashMap;

// import io.slc.jsm.defaultruntime.instructions.Syscall;

class InstructionSet
{
    // @SuppressWarnings("serial")
    // private static final Map<Integer, Class<? extends Instruction>> instructions = new HashMap<Integer, Class<? extends Instruction>>() {{
    //     put(0xF0, Syscall.class);
    // }};

    public Instruction get(final int opcode)
        throws InvalidInstructionException
    {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}