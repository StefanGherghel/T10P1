import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>)
{
    val fp = FactoryProducer()
    var EliteFactory = fp.getFactory("Elite")
    var WorkerFactory = fp.getFactory("worker")

    var CEO1 = EliteFactory.getHandler("CEO")
    var CEO2 = EliteFactory.getHandler("CEO")

    var Executive1 = EliteFactory.getHandler("Executive")
    var Executive2 = EliteFactory.getHandler("Executive")

    var Manager1 =  EliteFactory.getHandler("Manager")
    var Manager2 =  EliteFactory.getHandler("Manager")

    var Worker1 = WorkerFactory.getHandler("Worker")
    var Worker2 = WorkerFactory.getHandler("Worker")

    runBlocking {
        var job1 =launch{
            CEO1?.setNEXT(Executive1,CEO2)
            Executive1?.setNEXT(Manager1,Executive2)
            Manager1?.setNEXT(Worker1,Manager2)
            Worker1?.setNEXT(Worker2,null);
            Worker2?.setNEXT(Manager2,null);
            Manager2?.setNEXT(Executive2,null);
            Executive2?.setNEXT(CEO2,null);
            CEO2?.setNEXT(CEO1,null);

            CEO1?.handleRequest("fwd", "task2")
        }

        job1.join()
    }



}