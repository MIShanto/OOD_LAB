package Abstract_Factory_assignment;

public class NotificationService
{
	public static void main(String[] args)
	{
		AbstractNotificationFactory realTimeNotificationFactory = FactoryProducer.getFactory(true);

		Notification realTimeSMSNotification = realTimeNotificationFactory.getNotification("SMS");
		realTimeSMSNotification.notifyUser();

        Notification realTimeEmailNotification = realTimeNotificationFactory.getNotification("EMAIL");
		realTimeEmailNotification.notifyUser();

        Notification realTimePushNotification = realTimeNotificationFactory.getNotification("PUSH");
		realTimePushNotification.notifyUser();

		System.out.println("---------------------------------");

		AbstractNotificationFactory regularNotificationFactory =  FactoryProducer.getFactory(false);
		
		Notification regularSMSNotification = regularNotificationFactory.getNotification("SMS");
		regularSMSNotification.notifyUser();

        Notification regularEmailNotification = regularNotificationFactory.getNotification("EMAIL");
		regularEmailNotification.notifyUser();

        Notification regularPushNotification = regularNotificationFactory.getNotification("PUSH");
		regularPushNotification.notifyUser();
	}
}
