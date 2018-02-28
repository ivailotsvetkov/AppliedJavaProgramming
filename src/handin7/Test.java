package handin7;

public class Test
{

   public static void main(String[] args)
   {
      BoundedMuseumCounter counter = new BoundedMuseumCounter();
      Thread t1 = new TourGuideThread("tour 1", counter, 14);
      Thread t2 = new TourGuideThread("tour 2", counter, 9);
      Thread t3 = new TourGuideThread("tour 3", counter, 3);
      Thread t4 = new TourGuideThread("tour 4", counter, 1);
      Thread t5 = new DisplayThread(counter);
      
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      t5.start();
   }

}
