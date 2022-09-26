
package Question1;

import java.util.Scanner;
import java.util.ArrayList;


public class Test_Class 
{
    //Array list to store all contacts
    public static ArrayList<Contact> contact= new ArrayList<>();
    public static void main(String[] args)
    {
        
     System.out.println("*******************************************************");
     System.out.println("-------------WELCOME TO MY APPLICATION-----------------");
     System.out.println("*******************************************************");
     while(true)
     {
        //class libriary for scanner
        Scanner scan= new Scanner(System.in);
        try
        {
           //call menu
           Methods.Menu();
           String selection=scan.next();//accept the entered value
           
           if(null!=selection)
            switch (selection) 
            {
                case "1":
                    //option to add contacts
                    Methods.AddContact(scan,contact);
                    break;
                case "2":
                    //option to display all contacts
                    Methods.DisplayContact(contact,scan);
                    break;                   
                case "3":
                    //option to search contacts
                    Methods.SearchContact(scan,contact);
                    break;          
                case "4":
                    //option to update contact
                    Methods.UpdateContact(scan, contact);
                    break;            
                case "5":
                    //option to delete contact
                    Methods.DeleteCotact(scan, contact);
                    break;
                default:
                    //closing application
                    Methods.QuitApplication(scan);
                    break;
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ex.toString());
            continue;
        }
     }
    }
    
}
