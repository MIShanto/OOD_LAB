package Chain_of_responsibility_assignment;

public class Account 
{
    String accountantName;
    float balance;

    Account(String name, float openingBalance)
    {
        accountantName = name;
        balance = openingBalance;
    }

    public void WithDraw(float amount)
    {
        balance -= amount;

        System.out.println(amount + " BDT withdrawn succesfully....");
    }
    public float GetBalance()
    {
        return balance;
    }
    public String GetAccountantName()
    {
        return accountantName;
    }
}
