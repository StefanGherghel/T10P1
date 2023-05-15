abstract class AbstractFactory {
    abstract fun getHandler(handler: String): Handler?
}