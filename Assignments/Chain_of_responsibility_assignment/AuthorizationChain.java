package Chain_of_responsibility_assignment;

public class AuthorizationChain 
{
    Authorizer authorizer;

    public AuthorizationChain() 
    {
        Authorizer cashier = new Cashier(0, 10000);
        Authorizer manager = new Manager(10000, 1000001);
        Authorizer seniorOfficer = new SeniorOfficer(1000001, Float.POSITIVE_INFINITY);

        cashier.SetNextAuthorizer(manager);
        manager.SetNextAuthorizer(seniorOfficer);

        this.authorizer = cashier;
    }

    public Authorizer getAuthorizer()
    {
        return authorizer;
    }
}
