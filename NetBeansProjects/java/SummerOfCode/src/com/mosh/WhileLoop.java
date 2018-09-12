/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosh;

import java.util.logging.Logger;

/**
 *
 * @author mosh
 */
public class WhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logger l = Logger.getLogger(Person.class.getName());
        int aa = 0;
        while (aa < 3) {
            Person p = new Person("Joe Q Author", 42, 173, 82, "Brown", "MALE");
            l.info("Loop executing iteration# " + aa);
            l.info("Name: " + p.getName());
            l.info("Age:" + p.getAge());
            l.info("Height (cm):" + p.getHeight());
            l.info("Weight (kg):" + p.getWeight());
            l.info("Eye Color:" + p.getEyeColor());
            l.info("Gender:" + p.getGender());
            aa++;
        }
    }
    
}
