/*
 * Copyright (c) 2023 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- Showing Dependency Injection Example with Guice.
 *   Modified from https://www.baeldung.com/guice
 *
 */

package at.jku.ple.dependencyInjection;

public class ExtendedDefaultCommunicator extends DefaultCommunicatorImpl {

    @Override
    public boolean sendMessage(String message){
        super.sendMessage(message);
        System.out.println("Do something else");

        return true;
    }

}
