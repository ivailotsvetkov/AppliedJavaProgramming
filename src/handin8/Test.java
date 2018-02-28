package handin8;

public class Test
{

   public static void main(String[] args)
   {
      PizzaMethods method = new PizzaMethods();
      Thread t1 = new ProgrammerThread("Aleksi", method);
      Thread t4 = new ProgrammerThread("Kasper", method);
      Thread t5 = new ProgrammerThread("Myri", method);
      Thread t2 = new ScrumMasterThread("Hans", method);
      Thread t3 = new PizzaGuyThread("Jens", method);
      t3.start();
      t2.start();
      t5.start();
      t4.start();
      t1.start();
   }

}
