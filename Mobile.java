
public class Mobile extends Gadget
{
    private int CallingCreditRemaining;
    
    public Mobile(String model, double price, int weight, String size, int callingCreditRemaining)
    {
        super(model, price, weight, size);
        this.CallingCreditRemaining = callingCreditRemaining;
    }
    
    public int getCallingCreditRemaining()
    {
        return CallingCreditRemaining;
    }
    
    public void addCallingCredit(int creditToAdd)
    {
        if (creditToAdd > 0) {CallingCreditRemaining += creditToAdd; }
         
        else 
        
        {System.out.println("Please enter a positive amount to add calling credit.");
    }
}

public void makePhoneCall(String phoneNumber, int callDuration)
{
    if (CallingCreditRemaining >= callDuration)
    { System.out.println("Calling " + phoneNumber + "for " + callDuration + "minutes.");
        CallingCreditRemaining-= callDuration;}
        else 
        {
            System.out.println("Insufficient calling credit to make a call."); 
        }
}

public void display()
{
    super.display();
    System.out.println("Calling Credit Remaining: " + CallingCreditRemaining + "minutes");
        
    }
    public static void main(String[] args)
    {
        Mobile mobile = new Mobile ("Example Model", 199.99,150, "71mm x 137mm x 9mm", 100);
        mobile.display(); 
        mobile.addCallingCredit(50);
        mobile.makePhoneCall("123456789", 40);
        mobile.display(); 
        
    }
}
