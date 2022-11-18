package Abstract_Factory_assignment;

public class RegularSMSNotification implements Notification 
{

	//@Override
	public void notifyUser()
	{
		System.out.println("Sending a regular SMS notification");
	}
}

