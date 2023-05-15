class FactoryProducer
{
    fun getFactory(choice:String):AbstractFactory
    {
        if(choice.equals("Elite"))
            return EliteFactory()
        else
            return HappyWorkerFactory()
    }

}