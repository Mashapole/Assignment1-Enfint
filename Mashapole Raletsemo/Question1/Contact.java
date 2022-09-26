
package Question1;


public class Contact implements Comparable<Contact>
{
    private String name;
    private long contactNumber;
    private String phoneName;

    public Contact() 
    {
        
    }

    public Contact(String name, long contactNumber, String phoneName) 
    {
        this.name = name;
        this.contactNumber = contactNumber;
        this.phoneName = phoneName;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public long getContactNumber() 
    {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) 
    {
        this.contactNumber = contactNumber;
    }

    public String getPhoneName() 
    {
        return phoneName;
    }

    public void setPhoneName(String phoneName) 
    {
        this.phoneName = phoneName;
    }

    @Override
    public int compareTo(Contact t) 
    {
        
        return (int) this.contactNumber;
    }
    
}
