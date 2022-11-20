package State;

public class AlertStateContext 
{
    MobileAlertState currentState;

    public void setState(MobileAlertState state)
	{
		currentState = state;
	}

	public void alert()
	{
		currentState.alert(this);
	}
}
