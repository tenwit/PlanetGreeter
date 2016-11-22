package planetgreeter.consoleapp

import planetgreeter.Greeter
import planetgreeter.Planet
import planetgreeter.Renderer

class ConsoleApp {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            Greeter(ConsoleRenderer()).greet(Planet())
        }
    }
}

