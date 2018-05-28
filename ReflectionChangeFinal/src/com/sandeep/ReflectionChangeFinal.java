package com.sandeep;

import org.junit.Test;
import java.lang.reflect.Field;
import static org.junit.Assert.*;

public class ReflectionChangeFinal {

    @Test
    public void testABitOfReflection() throws Exception, SecurityException {
        final String name = "John";
        assertEquals("John", name );

        Field stringField = String.class.getDeclaredField("value");
        stringField.setAccessible(true);

        stringField.set(name, "Paul".toCharArray());
        assertEquals("Paul", name);
    }
}
