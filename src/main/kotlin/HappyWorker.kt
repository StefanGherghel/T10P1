class HappyWorker(var next1: Handler? = null, var next2: Handler? = null): Handler
{
    override suspend fun handleRequest(forwardDirection: String, messageToBeProcessed: String)
    {
        if(messageToBeProcessed.endsWith("4"))
        {
            println( "Sunt Happy Worker Handler si am prelucrat mesajul "+ messageToBeProcessed)
        }
        next1?.handleRequest("back","Worker a procesat")
    }
    override suspend fun setNEXT(n1:Handler?, n2:Handler?)
    {
        next1 = n1
        next2 = n2
    }
}
