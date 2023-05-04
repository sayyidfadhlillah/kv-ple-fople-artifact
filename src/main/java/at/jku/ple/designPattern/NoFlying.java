/*
 * Copyright (c) 2023 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- Showing Strategy Design Pattern Example
 *
 */

package at.jku.ple.designPattern;

public class NoFlying implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am not flying T_T");
    }

}
