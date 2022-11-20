package Mediator;

public class ChatRoom 
{
    public static void SendMessage(User user, String msg)
    {
        System.out.println(msg + ". :User [" + user.name + "]");
    }
}
