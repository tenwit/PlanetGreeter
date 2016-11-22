package planetgreeter

class Greeter(val output: Renderer) {
    fun greet(planet: Planet) {
        output.render("Hello $planet!")
    }
}

