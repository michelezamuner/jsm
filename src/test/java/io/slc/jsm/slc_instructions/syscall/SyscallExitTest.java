package io.slc.jsm.slc_instructions.syscall;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;

import java.util.List;
import java.util.ArrayList;

import io.slc.jsm.slc_interpreter.ExecutionResult;
import io.slc.jsm.slc_runtime.Instruction;
import io.slc.jsm.slc_runtime.VirtualMachine;
import io.slc.jsm.slc_runtime.Register;
import io.slc.jsm.slc_runtime.InstructionExecutionException;

@SuppressWarnings({"initialization"})
@ExtendWith(MockitoExtension.class)
public class SyscallExitTest
{
    private SyscallExit instruction = new SyscallExit();

    @Mock private VirtualMachine vm;

    @Test
    public void isInstruction()
    {
        assertTrue(instruction instanceof Instruction);
    }

    @Test
    public void producesResultWithExitRequest()
        throws InstructionExecutionException
    {
        final List<Integer> operands = new ArrayList<>();
        final int exitStatus = 192;
        when(vm.readRegister(Register.EBX)).thenReturn(exitStatus);

        final ExecutionResult result = instruction.exec(vm, operands);
        assertTrue(result.shouldExit());
        assertEquals(exitStatus, result.getExitStatus());
    }
}