package Mediator;

public class User 
{
    String name;

    User(String name)
    {
        this.name = name;
    }

    public void SendMessage(String msg)
    {
        ChatRoom.SendMessage(this, msg);
    }

}
