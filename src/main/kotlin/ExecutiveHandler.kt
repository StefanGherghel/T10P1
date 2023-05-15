class ExecutiveHandler(var next1: Handler? = null, var next2: Handler? = null): Handler {
    override suspend fun handleRequest(forwardDirection: String, messageToBeProcessed: String)
    {
        if(messageToBeProcessed.endsWith("2"))
        {
            println( "Sunt Executive Handler si am prelucrat mesajul "+ messageToBeProcessed)
            next2?.handleRequest("back","Executive a procesat")
        }
        else
            next1?.handleRequest(forwardDirection,messageToBeProcessed)
    }
    override suspend fun setNEXT(n1:Handler?, n2:Handler?)
    {
        next1 = n1
        next2 = n2
    }
}