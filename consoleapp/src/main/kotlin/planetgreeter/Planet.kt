package planetgreeter

class Planet(val name: String = "") {
    override fun toString(): String = if(name.length == 0) "World" else name
}

