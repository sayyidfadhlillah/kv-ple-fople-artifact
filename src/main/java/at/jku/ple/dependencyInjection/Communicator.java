/*
 * Copyright (c) 2023 Johannes Kepler University Linz
 *
 * Contributors:
 *   Hafiyyan Sayyid Fadhlillah -- Showing Dependency Injection Example with Guice.
 *   Modified from https://www.baeldung.com/guice
 *
 */

package at.jku.ple.dependencyInjection;

public interface Communicator {

    boolean sendMessage(String message);

}
