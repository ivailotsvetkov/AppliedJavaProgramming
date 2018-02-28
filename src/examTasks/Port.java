package examTasks;

public class Port<T> implements IPort
{
   private final int DEFAULT_CAPACITY = 4;
   private T[] queue;
   private int tail, front;

   public Port()
   {
      queue = (T[]) new Object[DEFAULT_CAPACITY];
      tail = 0;
      front = 0;
   }

   @Override
   public synchronized boolean send(String message)
   {
      int rear = (tail + front) % queue.length;
      if (queue.length == 4)
      {
         return false;
      }
      else
      {
         queue[rear] = (T) message;

         tail++;
         notifyAll();

      }

      return true;
   }

   @Override
   public synchronized String receive()
   {
      int rear = (tail + front) % queue.length;
      while (queue.length == 0)
      {
         try
         {
            wait();
         }
         catch (InterruptedException e)
         {
         }
      }
      return (String) queue[rear];
   }

}
