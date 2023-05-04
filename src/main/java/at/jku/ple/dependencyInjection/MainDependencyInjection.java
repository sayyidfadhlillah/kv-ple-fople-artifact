/*
 * Copyright (c) 2023 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- Showing Dependency Injection Example with Guice.
 *   Modified from https://www.baeldung.com/guice
 *
 */

package at.jku.ple.dependencyInjection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class MainDependencyInjection {

    public static void main(String[] args){
        Injector injector = Guice.createInjector(new BasicModule());
        Communication comms = injector.getInstance(Communication.class);

        comms.sendMessage("I love PLE with Guice");
    }

}
