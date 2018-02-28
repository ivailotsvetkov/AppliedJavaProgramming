package handin8;

public class PizzaMethods implements IPizzaMethods
{
   private int slicesLeft;
   boolean change = false;
   private final int MIN_NUMBER_SLICES = 0;
   private final int STANDART_PIZZA_SLICES = 8;

   public PizzaMethods()
   {
      slicesLeft = 0;
   }

   @Override
   public synchronized void orderAPizza()
   {
      while (slicesLeft > MIN_NUMBER_SLICES || change)
      {
         try
         {
            wait();
         }
         catch (InterruptedException e)
         {
         }

      }
      change = true;
      notifyAll();
   }

   @Override
   public synchronized void getAPizzaSlice()
   {
      if (slicesLeft == MIN_NUMBER_SLICES)
      {
         try
         {
            wait();
         }
         catch (InterruptedException e)
         {
         }

      }

      slicesLeft--;
      notifyAll();
   }

   @Override
   public synchronized void receiveAPizzaOrder()
   {
      while (change == false)
      {
         try
         {
            wait();
         }
         catch (InterruptedException e)
         {
         }
         ;
      }
      

      
   }

   @Override
   public synchronized void deliverAPizza()
   {

      slicesLeft += STANDART_PIZZA_SLICES;
      change = false;
      System.out.println(slicesLeft);
      notifyAll();
   }

   public int getSlicesLeft()
   {
      return slicesLeft;
   }

}
