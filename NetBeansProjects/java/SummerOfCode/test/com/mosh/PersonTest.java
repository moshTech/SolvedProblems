/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosh;

import com.mosh.Person;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.logging.Logger;

/**
 *
 * @author mosh
 */
public class PersonTest {
    
    public PersonTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testPerson() {
        Person p = new Person("Joe Q Author", 42, 173, 82, "Brown", "MALE");
        Logger l = Logger.getLogger(Person.class.getName());
        l.info("Name: " + p.getName());
        l.info("Age:" + p.getAge());
        l.info("Height (cm):" + p.getHeight());
        l.info("Weight (kg):" + p.getWeight());
        l.info("Eye Color:" + p.getEyeColor());
        l.info("Gender:" + p.getGender());
//        assertEquals("Joe Q Author", p.getName());
//        assertEquals(42, p.getAge());
//        assertEquals(173, p.getHeight());
//        assertEquals(82, p.getWeight());
//        assertEquals("Brown", p.getEyeColor());
//        assertEquals("MALE", p.getGender());
    }
}
