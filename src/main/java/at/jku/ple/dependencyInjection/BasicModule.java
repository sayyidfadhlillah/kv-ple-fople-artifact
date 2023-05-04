/*
 * Copyright (c) 2023 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- Showing Dependency Injection Example with Guice.
 *   Modified from https://www.baeldung.com/guice
 *
 */

package at.jku.ple.dependencyInjection;

import com.google.inject.AbstractModule;

public class BasicModule extends AbstractModule {

    @Override
    protected void configure(){
        bind(Communicator.class).toInstance(new DebuggingCommunicatorImpl());
        bind(Communication.class).toInstance(new Communication(true));
    }

}
