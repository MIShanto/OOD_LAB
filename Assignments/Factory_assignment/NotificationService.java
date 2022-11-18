package Factory_assignment;

public class NotificationService
{
	public static void main(String[] args)
	{
		NotificationFactory notificationFactory = new NotificationFactory();

		Notification SMSNotification = notificationFactory.createNotification("SMS");
		SMSNotification.notifyUser();

        Notification emailNotification = notificationFactory.createNotification("EMAIL");
		emailNotification.notifyUser();

        Notification pushNotification = notificationFactory.createNotification("PUSH");
		pushNotification.notifyUser();
	}
}
