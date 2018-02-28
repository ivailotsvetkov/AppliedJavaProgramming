package handin7;

public class TourGuideThread extends Thread
{
   private BoundedMuseumCounter counter;

   private int visitors;

   public TourGuideThread(String name, BoundedMuseumCounter counter,
         int visitors)
   {
      super(name);
      this.counter = counter;
      this.visitors = visitors;
   }

   public void run()
   {
      int numberInGroup;
      System.out.println("Running.. " + getName());
      while (true)
      {
         numberInGroup = arrivalOfVisitors();
         counter.enter(numberInGroup);
         guiding();
         counter.leave(numberInGroup);

      }
   }

   private int arrivalOfVisitors()
   {
      return visitors;
   }

   private void guiding()
   {
      System.out.println(arrivalOfVisitors()
            + " people just entered the museum.");
      try
      {
         Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {

      }
   }

}