package handin8;

public class ProgrammerThread extends Thread
{
   private PizzaMethods programmer;
   private String name;

   public ProgrammerThread(String name, PizzaMethods programmer)
   {
      super();
      this.name = name;
      this.programmer = programmer;
   }

   private void program()
   {
      System.out.println(name + " :I'm programming .. ");
      try
      {
         Thread.sleep(3000);
      }
      catch (InterruptedException e)
      {

      }

   }

   public void run()
   {
      while (true)
      {

         System.out.println(name + " : I'm hungry.I'm gonna get a slice");
         programmer.getAPizzaSlice();
         program();
      }
   }
}
