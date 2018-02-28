package handin1;
import java.util.Scanner;

public class Main2Exercise5
{
  public static void main(String[] args)
  {    
     Scanner sc=new Scanner(System.in);
    int choice;
    
    int n;
    long result;
     
    do
    {
      menu();
      choice = sc.nextInt();
      switch (choice)
      {
        case 1 : // Exercise 5 solving 1
          System.out.print("Type N ( 0 < N <=5):");
          n = sc.nextInt();
          System.out.println();
          
          Exercise5.solving1 (n);          
          System.out.println();
          break;  
        case 2 : // Exercise 5 solving 2
            System.out.print("Type N (10, 100, 1000, ...):");
            n =sc.nextInt();
            System.out.println();
            
            result = Exercise5.solving2 (n);          
            System.out.println("Number of triples: " + result + "\n");
            break; 
        default :
          break;
      }
    }
    while (choice > 0);
    System.out.println("** End of test Hand-in 1 **");
  } 
  
  private static void menu()
  {
    System.out.println(" TEST-MENU for Hand-in 1");
    System.out.println(" 1) Solving 1");
    System.out.println(" 2) Solving 2");
    System.out.println(" 0) Quit");
    System.out.print(" Type your choice: ");
  }
}

