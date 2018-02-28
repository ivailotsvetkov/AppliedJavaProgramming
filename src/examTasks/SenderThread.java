package examTasks;

public class SenderThread extends Thread
{
   private Port port;

   public SenderThread(Port port)
   {
      super();
      this.port = port;
   }

   public void run()
   {
      while (true)
      {
         port.send("kurec2");

      }
   }
}
