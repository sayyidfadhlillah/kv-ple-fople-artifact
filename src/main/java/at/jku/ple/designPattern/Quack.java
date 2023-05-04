/*
 * Copyright (c) 2023 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- Showing Strategy Design Pattern Example
 *
 */

package at.jku.ple.designPattern;

public class Quack implements QuackBehavior {


    @Override
    public void quack() {
        System.out.println("I am quacking, quack quack");
    }
}
