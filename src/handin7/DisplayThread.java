package handin7;

public class DisplayThread extends Thread
{
   BoundedMuseumCounter counter;

   public DisplayThread(BoundedMuseumCounter counter)
   {
      this.counter = counter;
   }

   public void run()
   {
      while (true)
      {
         System.out.println(counter.getNumber()
               + " number of people in the museum.");
      }
   }
}
