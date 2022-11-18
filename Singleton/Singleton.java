package Singleton;

class Singleton
{
    static Singleton instance = null;

    public static Singleton getInstance()
    {
        if(instance == null)
            instance = new Singleton();

        return instance;
    }

    public void print()
    {
        System.out.println("Hello from singleton");
    }
}