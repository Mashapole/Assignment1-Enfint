
package Question1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Methods 
{

    public static void Menu() 
    {
     System.out.println("Please select what to do");
     System.out.println("1. Add Contact");
     System.out.println("2. Display Contact");
     System.out.println("3. Search Contact");
     System.out.println("4. Update Contact");
     System.out.println("5. Delete Contact");
     System.out.println("6. Quit Application");
    }

    public static void QuitApplication(Scanner scan) 
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

    public static void AddContact(Scanner scan, ArrayList<Contact> contact) 
    {
     //viariables to store required information
     String name, pair;
     long phoneNumber;
        
     System.out.println("-------------------ADD NEW CONTACT------------------");
     System.out.println("****************************************************");
     name=PromptName(scan);// call method that returns entered name
     phoneNumber=PromptNumber(scan);//call method that returns entered phone number
     pair=phoneNumber+"-"+name;// concatenate phone-number and name 
     contact.add(new Contact(name,phoneNumber,pair));//passs the values to the collection class
     System.out.println("\nContact Stored!!!");
    }
    public static void DisplayContact(ArrayList<Contact> contact,Scanner scan) 
    {
    System.out.println("-------------------CONTACT LIST---------------------");
    System.out.println("====================================================");

    int count=1;
    Collections.sort(contact);

    for(Contact con: contact)
    {
      System.out.println("--------------------------------------------------");
      System.out.println("CONTACT NO:\t\t\t"+String.valueOf(count));
      System.out.println("Contact Name: \t\t\t"+con.getName());
      System.out.println("Contact Number: \t\t"+con.getContactNumber());
      System.out.println("Paired Name: \t\t\t"+con.getPhoneName());
      count++;
      System.out.println("--------------------------------------------------");
     }
     System.out.println("====================================================");
     System.out.println("TOTAL CONTACT COUNT:\t\t"+String.valueOf(count-1));
     System.out.println("====================================================");
        
    }
    public static void SearchContact(Scanner scan, ArrayList<Contact> contact) 
    {
     System.out.println("-----------------SEARCH FOR CONTACT-------------------");
     System.out.println("******************************************************");
     System.out.print("Enter the Contact name to search: ");
     String searchName=scan.next();//getting contact to be searched from scanner 
     
     System.out.println("\n\n******************************************************");
     System.out.println("---------------CONTACT SEARCH RESULTS HERE-------------");
     System.out.println(ReturnSearch(contact,searchName));
     System.out.println("*******************************************************");
     
    }
    private static ArrayList<Long> ReturnSearch(ArrayList<Contact> contact, String searchName) 
    {
        //array list to store searched contact
        ArrayList<Long> search= new ArrayList<>();
        for(Contact con: contact)
        {
            if(searchName.equalsIgnoreCase(con.getName()))
            {
              search.add(con.getContactNumber()); //add contact 
            }
            
        }
        
     return search;
    }

    public static void UpdateContact(Scanner scan, ArrayList<Contact> contact) 
    {
     System.out.println("\n-------------SEARCH AND UPDATE CONTACT--------------");
     System.out.println("******************************************************");
     //variables to store entered values for update 
     String name="",pair="";
     long phone=0;
     
     System.out.print("Enter phone-name value to update Contact: ");
     String searchPair=scan.next();
     for(Contact con: contact)
        {
            if(searchPair.equalsIgnoreCase(con.getPhoneName()))
            {  //firstly read the data where matched and store inside the variables 
               name=con.getName();
               phone=con.getContactNumber();
            }
            
        }
    System.out.println("#Name: \t"+name.toUpperCase()+" #Contact:\t"+phone);
    System.out.println("Would you like to update Name? (y) Yes, (n) No");
    String nameKey=scan.next();
    if(nameKey.equalsIgnoreCase("y") || nameKey.equalsIgnoreCase("Yes"))
    {
        name=PromptName(scan);
    }
    System.out.println("Would you like to update Contact? (y) Yes, (n) No");
    String contactKey=scan.next();
    if(contactKey.equalsIgnoreCase("y") || contactKey.equalsIgnoreCase("Yes"))
    {
        phone=PromptNumber(scan);//call method for prompting user
    }
    //concatenate the phone number and name 
    pair=phone+"-"+name;
    
    int count=0;
    for(Contact con: contact)
    {
        if(searchPair.equalsIgnoreCase(con.getPhoneName()))
        {
          contact.set(count, new Contact(name,phone,pair));
          System.out.println("Contact Updated Successfully!");
        }
    count++;
    }
    
    }

    private static String PromptName(Scanner scan) 
    {
    System.out.print("Please enter user name: ");
    return scan.next();
    }

    private static long PromptNumber(Scanner scan) 
    {
    System.out.print("Please enter contact number: ");
    return scan.nextLong();
    }

    public static void DeleteCotact(Scanner scan, ArrayList<Contact> contact) 
    {
     System.out.println("\n-------------SEARCH AND DELETE CONTACT--------------");
     System.out.println("******************************************************");
     
     System.out.print("Enter phone-name value to Delete Contact: ");
     String searchPair=scan.next();
     int count=0;
     String name="";
     for(Contact con: contact)
        {
            if(searchPair.equalsIgnoreCase(con.getPhoneName()))
            {
             name=con.getName();
             Confirm(count,name,scan,contact);
            }
         count++;
        } 
    }

    private static void Confirm(int coun,String name,Scanner scan, ArrayList<Contact> contact) 
    {
        System.out.println("Are you sure you want to delete "+name.toUpperCase()+" 's Contact? (y) Yes, (n) No");
        String key=scan.next();
        
        if(key.equalsIgnoreCase("yes") || key.equalsIgnoreCase("y"))
        {
            contact.remove(coun);
            System.out.println("Contact Deleted!");
            
        }
    }
}
