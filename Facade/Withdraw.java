package Facade;

public class Withdraw implements IBankService
{

    @Override
    public void MakeTransaction(float amount) 
    {
        System.out.println("withdrawing BDT " + amount);   
    }
    
}
