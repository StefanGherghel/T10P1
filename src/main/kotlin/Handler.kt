interface Handler
{
    suspend fun handleRequest(forwardDirection: String, messageToBeProcessed: String)
    suspend fun setNEXT(n1:Handler?, n2:Handler?)

}