package Facade;

public class Deposit implements IBankService
{
    @Override
    public void MakeTransaction(float amount) 
    {
        System.out.println("depositing BDT " + amount);       
    }
}
