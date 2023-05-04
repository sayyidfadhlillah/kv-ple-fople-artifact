/*
 * Copyright (c) 2023 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- Showing Strategy Design Pattern Example
 *
 */

package at.jku.ple.designPattern;

public class MainDesignPattern {

    public static void main(String[] args){

        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();

        mallardDuck.fly();
        mallardDuck.quack();

        rubberDuck.fly();
        rubberDuck.quack();

    }

}
