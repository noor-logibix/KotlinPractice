package car

interface Car {
    abstract fun createEngine(hp: Int): String
    fun createBody(): Boolean
    fun paint(color: String): Boolean
}