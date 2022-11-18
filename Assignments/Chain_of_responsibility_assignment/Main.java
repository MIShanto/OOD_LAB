package Chain_of_responsibility_assignment;

public class Main 
{
    public static void main(String[] args) 
    {
        Account account = new Account("Monirul Islam", 50000);
        
        AuthorizationChain authorizationChain = new AuthorizationChain();
        Authorizer authorizer = authorizationChain.getAuthorizer();

        float amount = 10000;

        Boolean isAuthorized = authorizer.AuthorizeWithdrawal(account, amount);

        if(isAuthorized)
            account.WithDraw(amount);
        else
            System.out.println("Withdrawal failed. Insufficient ammount");
    }
}
