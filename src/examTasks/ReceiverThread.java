package examTasks;

public class ReceiverThread extends Thread
{
   private Port port;

   public void run()
   {
      port.receive();
      
   }
}
