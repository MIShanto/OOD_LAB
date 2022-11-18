package Chain_of_responsibility_assignment;

public abstract class Authorizer 
{
    Authorizer nextAuthorizer;
    public float minLimitToAuthorize, maxLimitToAuthorize;
    String authorizerName;
    Boolean isAuthorized;

    public void SetNextAuthorizer(Authorizer authorizer)
    {
        nextAuthorizer = authorizer;
    }

    public Boolean AuthorizeWithdrawal(Account account, float withdrawAmount)
    {
        if(account.GetBalance() < withdrawAmount)
        {
            isAuthorized = false;

            return isAuthorized;
        }

        if(withdrawAmount >= minLimitToAuthorize)
        {
            isAuthorized = true;
            doAuthorization(withdrawAmount);

            if(nextAuthorizer != null && withdrawAmount >= maxLimitToAuthorize)
                isAuthorized = nextAuthorizer.AuthorizeWithdrawal(account, withdrawAmount);
        }
        else
        {
            OnAuthorizaionFailed();
        }

        return isAuthorized;
    }
    
    String GetAuthorizerName()
    {
        return authorizerName;
    }

    abstract void doAuthorization(float withdrawAmount);
    abstract void OnAuthorizaionFailed();
}
