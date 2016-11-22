package planetgreeter.steps

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.assertj.core.api.Assertions.assertThat
import java.io.ByteArrayOutputStream
import java.io.PrintStream

import planetgreeter.consoleapp.ConsoleApp
import planetgreeter.Planet

/**
 * @author Matt from PlanetGreeter
 */
class Basic {
    @Given("an unnamed planet")
    fun preparePlanet() {
        // The default planet will do. Just double-check that it exists.
        assertThat(planet.name).isEmpty()
    }

    @When("^the basic console app is invoked$")
    fun invokeConsoleApp() {
        val originalOut = System.out
        try {
            val out = ByteArrayOutputStream()
            System.setOut(PrintStream(out))
            ConsoleApp.main(arrayOf())
            consoleOutput = out.toString()
        } finally {
            System.setOut(originalOut)
        }
    }

    @Then("^a planetary greeting is displayed in the console$")
    fun consoleShowsPlanetaryGreeting() {
        assertThat(consoleOutput).contains("Hello World!")
    }

    companion object State {
        val planet = Planet()
        var consoleOutput = ""
    }
}

