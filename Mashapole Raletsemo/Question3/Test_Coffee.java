package Question3;

import java.util.Scanner;


public class Test_Coffee 
{
    public static void main(String[] args)
    {
        /*
        On this problem, i create an enum class called coffee which it has different kind of coffees
        and an array of prices that link each coffee in a class enum. So when the program runs the menu 
        is displayed and the customer(User) is asked to enter coffee to purcahse, once coffee is entered 
        the message is displayed on the scree,  coffee+price.
        */
        System.out.println("***************************************************");
        System.out.println("----------WELCOME TO SMITH'S COFFEE SHOP-----------");
        //array for prices of coffees
        double[] price= new double[]{45,65,76,87,98,67,67,98,78};
        
        while(true)
        {
            Scanner scan= new Scanner(System.in);
            try
            {
              //calling menu from methods class
              Methods.Menu();
              String key=scan.next();//accepting the entered String or int value

              System.out.println("\n********************************************");
              System.out.println("----------------ORDER SLIP------------------");
              
              if(key.equals("1") || key.equalsIgnoreCase("EXPRESSO"))
              {
               System.out.println("Your Order For  "+Coffee.EXPRESSO.toString()+" is being placed, Price is  "+price[0]);
               return;
              }
              else if(key.equals("2") || key.equalsIgnoreCase("FRAPPUCCINO"))
              {
               System.out.println("Your Order For  "+Coffee.FRAPPUCCINO.toString()+" is being placed, Price is  "+price[1]);
               return;
              }
              else if(key.equals("3") || key.equalsIgnoreCase("AMERICANNO"))
              {
               System.out.println("Your Order For  "+Coffee.AMERICANNO.toString()+" is being placed, Price is  "+price[2]);
               return;
              }
              else if(key.equals("4") || key.equalsIgnoreCase("CAPPUCCINO"))
              {
               System.out.println("Your Order For  "+Coffee.CAPPUCCINO.toString()+" is being placed, Price is  "+price[3]);
               return;
              }
              else if(key.equals("5") || key.equalsIgnoreCase("CORTADO"))
              {
               System.out.println("Your Order For  "+Coffee.CORTADO.toString()+" is being placed, Price is  "+price[4]);
               return;
              }
              else if(key.equals("6") || key.equalsIgnoreCase("AFFORGATO"))
              {
               System.out.println("Your Order For  "+Coffee.AFFORGATO.toString()+" is being placed, Price is  "+price[5]);
               return;
              }
              else if(key.equals("7") || key.equalsIgnoreCase("PLAIN"))
              {
               System.out.println("Your Order For  "+Coffee.PLAIN.toString()+" coffee is being placed, Price is  "+price[6]);
               return;
              }
              else if(key.equals("8") || key.equalsIgnoreCase("CUBANO"))
              {
               System.out.println("Your Order For  "+Coffee.CUBANO.toString()+" coffee is being placed, Price is  "+price[7]);
               return;
              }
              else if(key.equals("9") || key.equalsIgnoreCase("IRISH"))
              {
               System.out.println("Your Order For  "+Coffee.IRISH.toString()+" coffee is being placed, Price is  "+price[8]);
               return;
              }
              else
              {
                  Methods.Exit(scan);
              }

            }
            catch(Exception ex)
            {
                System.out.println("Error:"+" "+ex.toString());
                continue;
            }
        }   
    }
    
}
