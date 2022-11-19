package Facade;

public class Facade 
{
    IBankService withdrawService; 
    IBankService depositService;

    Facade()
    {
        withdrawService = new Withdraw();
        depositService = new Deposit();
    }

    void Withdraw(float amount)
    {
        withdrawService.MakeTransaction(amount);
    }
    void Deposit(float amount)
    {
        depositService.MakeTransaction(amount);
    }
}
