package handin8;



public class PizzaGuyThread extends Thread
{
   private PizzaMethods pizzaGuy;
   private String name;

   public PizzaGuyThread(String name,PizzaMethods pizzaGuy)
   {
      super();
      this.name = name;
      this.pizzaGuy=pizzaGuy;
   }

   public void run()
   {
      while (true)
      {
         System.out.println(name+" : I have recieved the order");
         pizzaGuy.receiveAPizzaOrder();
         makingPizza();
         System.out.println(name+ ": At last, I made a pizza");
         System.out.println(name+ ": I'm gonna deliver it now.");
         pizzaGuy.deliverAPizza();
         
      }
   }
   private void makingPizza(){
      System.out.println(name+ " :I'm making the pizza .. ");
      try
      {
         Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {

      }
   }
}
