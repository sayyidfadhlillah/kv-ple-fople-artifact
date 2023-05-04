/*
 * Copyright (c) 2023 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- Showing Strategy Design Pattern Example
 *
 */

package at.jku.ple.designPattern;

public class RubberDuck extends Duck {


    public RubberDuck() {
        super(new Squeak(), new NoFlying());
    }
}
