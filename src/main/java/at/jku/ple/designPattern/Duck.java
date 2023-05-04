/*
 * Copyright (c) 2023 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- Showing Strategy Design Pattern Example
 *
 */

package at.jku.ple.designPattern;

public abstract class Duck {

    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;


    public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void quack(){
        this.quackBehavior.quack();
    }

    public void fly() {
        this.flyBehavior.fly();
    }

}
