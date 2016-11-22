package planetgreeter.consoleapp

import java.io.ByteArrayOutputStream
import java.io.PrintStream

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/**
 * Test the {ConsoleRenderer} class.
 *
 * @author Matt from PlanetGreeter
 */
class ConsoleRendererTest {
    @Test
    fun renderedTextGoesToStandardOutput() {
        val testText = "Should appear on console"
        val originalOut = System.out
        try {
            val out = ByteArrayOutputStream()
            System.setOut(PrintStream(out))
            ConsoleRenderer().render(testText)
            assertThat(out.toString()).contains(testText)
        } finally {
            System.setOut(originalOut)
        }
    }
}

