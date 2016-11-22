package planetgreeter.consoleapp

import planetgreeter.Renderer

class ConsoleRenderer: Renderer {
    override fun render(output: String) {
        System.out.println(output)
    }
}

