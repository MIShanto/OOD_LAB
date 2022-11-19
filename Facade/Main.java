package Facade;

public class Main 
{
    public static void main(String[] args) 
    {
        Facade facade = new Facade();

        float amountToDeposit = 5000;
        float amountToWithdraw = 1000;

        facade.Withdraw(amountToWithdraw);
        facade.Deposit(amountToDeposit);
    }
}
