package handin8;

public class ScrumMasterThread extends Thread
{
   private PizzaMethods scrumMaster;
   private String name;

   public ScrumMasterThread(String name, PizzaMethods scrumMaster)
   {
      super();
      this.name = name;
      this.scrumMaster = scrumMaster;
   }

   public void run()
   {
      while (true)
      {
         System.out.println(name + ": I'm gonna order a pizza");
         scrumMaster.orderAPizza();
         doSomething();
      }
   }

   private void doSomething()
   {
      System.out.println("I'm relaxing right now");
      try
      {
         Thread.sleep(3000);
      }
      catch (InterruptedException e)
      {

      }
   }
}
