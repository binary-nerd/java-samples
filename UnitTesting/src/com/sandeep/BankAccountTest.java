package com.sandeep;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases..");
    }

    @Before
    public void setup() {
        account = new BankAccount("Sandeep", "Mantrala", 1000);
        System.out.println("Running a test..");
    }

    @org.junit.Test
    public void deposit() throws Exception {
        BankAccount account = new BankAccount("sandeep", "lastname", 1000.00);
        double balance = account.deposit(200.00, true);
//        assertEquals(1200.00, balance);
          assertEquals(1200.00, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
    }

    @org.junit.Test
    public void getBalance() {
    }

    @Test
    public void dummyTest() {
        assertEquals(20, 21);
    }

    private static boolean flex( Field field, Object value )
    {
        try {
            Field modifiersField = Field.class.getDeclaredField( "modifiers" );
            boolean isModifierAccessible = modifiersField.isAccessible();
            modifiersField.setAccessible( true );
            modifiersField.setInt( field, field.getModifiers() & ~Modifier.FINAL );

            boolean isAccessible = field.isAccessible();
            field.setAccessible( true );
            field.set( null, value );

            field.setAccessible( isAccessible );
            modifiersField.setAccessible( isModifierAccessible );
            return true;
        } catch ( IllegalAccessException e ) {
            System.out.println("Could not access field {}" + field.getName() + e );
        } catch ( NoSuchFieldException e ) {
            System.out.println("Could not find field, cannot modify value" + e );
        }
        return false;
    }

    @Test
    public void testABitOfReflection() throws Exception, SecurityException {
        final String name = "John";
        assertEquals("John", name );
        HashMap
        // TODO: use reflection to change name from John to Paul

        Field stringField = String.class.getDeclaredField("value");
        stringField.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(stringField, stringField.getModifiers() & ~Modifier.FINAL);
        modifiersField.setInt(stringField, stringField.getModifiers() & ~Modifier.PRIVATE);

        Method[] methods = name.getClass().getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        stringField.set(name, "Paul".toCharArray());
        assertEquals("Paul", name);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("This executes after all test cases..");
    }


}