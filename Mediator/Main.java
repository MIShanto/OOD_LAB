package Mediator;

public class Main 
{
    public static void main(String[] args)
    {
        User usr1 = new User("MI");
        User usr2 = new User("Shanto");

        usr1.SendMessage("Hi..");
        usr2.SendMessage("Bye..");
    }
}
