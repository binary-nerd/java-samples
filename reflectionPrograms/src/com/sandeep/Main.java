package com.sandeep;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Shailza");

        try {
            Field field = person.getClass().getDeclaredField("name");
            field.setAccessible(true);
            System.out.println(field.get(person));
            /*
            *
            *
            * */

            Field numPeopleField =
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
//        System.out.println(person.name);
    }
}
