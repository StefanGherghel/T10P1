class HappyWorkerFactory: AbstractFactory() {
    override fun getHandler(handler: String): Handler?
    {
        if(handler.equals("Worker"))
            return HappyWorker(null,null)

        return null
    }
}