package Abstract_Factory_assignment;

public class RegularEmailNotification implements Notification 
{

	//@Override
	public void notifyUser()
	{
		System.out.println("Sending a regular e-mail notification");
	}
}

