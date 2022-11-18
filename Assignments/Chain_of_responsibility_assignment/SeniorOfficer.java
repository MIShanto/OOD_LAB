package Chain_of_responsibility_assignment;

public class SeniorOfficer extends Authorizer
{
    SeniorOfficer(float minLimit, float maxLimit)
    {
        minLimitToAuthorize = minLimit;
        maxLimitToAuthorize = maxLimit;
    }

    @Override
    void doAuthorization(float withdrawAmount) 
    {
        System.out.println("Senior officer authorization is done for withdraw request of BDT " + withdrawAmount);
        
    }

    @Override
    void OnAuthorizaionFailed() 
    {
        System.out.println("Authorizaion failed at Senior Officer level");      
    }

    

}
