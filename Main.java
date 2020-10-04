import java.util.Scanner;

/**
 * Will take a user number and use it in the hailstone sequence
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user for a positive integer
    System.out.println("Please enter a positive integer to see the hailstone sequence.");
    int n = input.nextInt();

    //Displays a message before the sequence 
    System.out.println("Hailstone sequence is the following:");
   
    //Displays the user number before the sequence
    System.out.println(n);

    //while n is not equal to one this loop runs
    while(n != 1){
      //if n is even will divide it by 2
      if(n % 2 == 0){
       n = n / 2;
       //displays n
       System.out.println(n);
      //if n is odd will multiply by 3 and add 1
      }else if(n % 2 == 1){
        n = 3 * n + 1;
        //displays n
        System.out.println(n);
      }
    }
  }
}
