//CHG4343_SectionA_2_2.java: working with the Scanner class
//Let's repeat the example from CHG_SectionA_2_1.java, but this time we'll read in data using the Scanner class
//We first need to import the class from the 'util' package
import java.util.Scanner;

public class CHG4343_SectionA_2_2
{
     public static void main(String[] args)
     {
           //Declare our variables, but don't assign them values
          int age;
          double height;
          double weight;
          String sex;
          boolean isAlive;
          
          //To use Scanner to read from the keyboard, we must first build a Scanner object
          //We'll call it 'input' attach it to the keyboard ('System.in')
          Scanner input = new Scanner(System.in);
          //Now we'll read the data - note the various Scanner methods called for the different data types
          //and the use of println to prompt data entry...
          System.out.println("Enter your age in years");
          age=input.nextInt();
          System.out.println("and now enter your height in cm"+"\nfollowed by your weight in kg.");
          height=input.nextDouble();
          weight=input.nextDouble();
          System.out.println("Enter your gender");
          sex=input.next();
          System.out.println("And finally, tell us if you are alive: \'True\' or \'False\'");
          isAlive=input.nextBoolean();
          //And now we will print out the results as before
          System.out.print("This individual is a "+sex+" aged "+ age);
          System.out.printf(" whose height is %5.1f",height);
          System.out.printf(" cm and who weighs %4.1f",weight);
          System.out.println(" kg.");
          System.out.print(" By the way...");
          System.out.println("When asked if they were alive, they replied \""+isAlive+"\".");               
     } //end of main method    
} //end of class