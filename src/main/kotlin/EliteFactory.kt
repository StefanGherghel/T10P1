class EliteFactory: AbstractFactory()
{
    override fun getHandler(handler: String): Handler?
    {
        if(handler.equals("CEO"))
            return  CEOHandler(null,null)

        if(handler.equals("Executive"))
            return ExecutiveHandler(null, null)

        if(handler.equals("Manager"))
            return ManagerHandler(null,null)

        return null
    }
}