package net.voidynullness.java.algo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorial() throws Exception {
        assertEquals(120, Factorial.factorial(5));
        assertEquals(720, Factorial.factorial(6));
    }
}
