package handin7;

public class BoundedMuseumCounter
{
   private static final int MAX_NUMBER_VISITORS = 30;
   private boolean change = false;
   private int visitorsATM;

   public BoundedMuseumCounter()
   {
      this.visitorsATM = 0;

   }

   public synchronized void enter(int numberInGroup)
   {
      while (visitorsATM + numberInGroup > MAX_NUMBER_VISITORS)
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
      change = true;
      visitorsATM += numberInGroup;
      notifyAll();
   }

   public synchronized void leave(int numberInGroup)
   {

      change = true;
      visitorsATM -= numberInGroup;
      notifyAll();
   }

   public synchronized int getNumber()
   {

      while (!change)
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

      change = false;
      return visitorsATM;

   }

}
