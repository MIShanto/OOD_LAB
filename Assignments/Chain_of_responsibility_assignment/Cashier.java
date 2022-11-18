package Chain_of_responsibility_assignment;

public class Cashier extends Authorizer
{
    Cashier(float minLimit, float maxLimit)
    {
        minLimitToAuthorize = minLimit;
        maxLimitToAuthorize = maxLimit;
    }

    @Override
    void doAuthorization(float withdrawAmount) 
    {
        System.out.println("Cashier authorization is done for withdraw request of BDT " + withdrawAmount);
        
    }

    @Override
    void OnAuthorizaionFailed() 
    {
        System.out.println("Authorizaion failed at Cashier level");      
    }
    
}
