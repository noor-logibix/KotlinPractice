package car

class Sedan: Car {
    override fun createEngine(hp: Int): String {
        return "Engine created with $hp hp"
    }

    override fun createBody(): Boolean {
        return true
    }

    override fun paint(color: String): Boolean {
        return true
    }
}