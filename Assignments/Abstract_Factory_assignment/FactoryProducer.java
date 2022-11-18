package Abstract_Factory_assignment;

public class FactoryProducer 
{
    public static AbstractNotificationFactory getFactory(boolean realTime)
    {   
       if(realTime)
       {
          return new RealTimeNotificationFactory();         
       }
       else
       {
          return new RegularNotificationFactory();
       }
    }
 }
