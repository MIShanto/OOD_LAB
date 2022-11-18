package Abstract_Factory_assignment;

public class RegularNotificationFactory extends AbstractNotificationFactory
{
	public Notification getNotification(String notificationType)
	{
		if (notificationType == null || notificationType.isEmpty())
			return null;
		switch (notificationType) 
        {
            case "SMS":
                return new RegularSMSNotification();
            case "EMAIL":
                return new RegularEmailNotification();
            case "PUSH":
                return new RegularPushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+notificationType);
		}
	}
}

