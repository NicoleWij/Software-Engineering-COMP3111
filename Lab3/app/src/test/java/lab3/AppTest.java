/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab3;

import org.junit.jupiter.api.Test;

import comp3111.lab3.ex2.Library;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        Library classUnderTest = new Library();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}