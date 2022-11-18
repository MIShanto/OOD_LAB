package Abstract_Factory_assignment;

public class RealTimeSMSNotification implements Notification 
{

	//@Override
	public void notifyUser()
	{
		System.out.println("Sending a real time SMS notification");
	}
}

