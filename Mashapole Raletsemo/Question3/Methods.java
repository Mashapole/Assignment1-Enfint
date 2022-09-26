
package Question3;

import java.util.Scanner;


public class Methods 
{

    public static void Menu() 
    {
        int count=1;
        System.out.println("Select Coffee you would like to buy:");
        for(Coffee cof: Coffee.values())
        {
           System.out.println(count+"."+" "+cof.toString()); 
           count++;
        }
        System.out.println("10. ENTER ANY KEY TO EXIT");
    }

    public static void Exit(Scanner scan) 
    {
     System.out.println("Are you sure you want to exit (y/n)?");
     String key=scan.next();

     if(key.equalsIgnoreCase("y"))
     {
     System.exit(0);   
     }
     else
     {
        Menu();
     }
    }
    
}
