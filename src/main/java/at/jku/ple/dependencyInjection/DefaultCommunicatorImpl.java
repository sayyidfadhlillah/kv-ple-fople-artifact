/*
 * Copyright (c) 2023 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- Showing Dependency Injection Example with Guice.
 *   Modified from https://www.baeldung.com/guice
 *
 */

package at.jku.ple.dependencyInjection;

public class DefaultCommunicatorImpl implements Communicator{

    @Override
    public boolean sendMessage(String message) {

        System.out.println(message);
        System.out.println("Hey ho it is sent");
        return true;
    }
}
