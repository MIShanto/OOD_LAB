package Abstract_Factory_assignment;

public class RealTimeNotificationFactory extends AbstractNotificationFactory
{
	public Notification getNotification(String notificationType)
	{
		if (notificationType == null || notificationType.isEmpty())
			return null;
            
		switch (notificationType) 
        {
            case "SMS":
                return new RealTimeSMSNotification();
            case "EMAIL":
                return new RealTimeEmailNotification();
            case "PUSH":
                return new RealTimePushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+notificationType);
		}
	}
}

