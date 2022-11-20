package Adapter;

public class Main 
{
    public static void main(String[] args) 
    {
        Bird bird = new Bird();
        ToyDuck toyDuck = new ToyDuck();

        IToyDuck adapter = new BirdAdapter(bird); 
        
        System.out.println("Bird...");
        bird.MakeSound();
  
        System.out.println("ToyDuck...");
        toyDuck.Squeak();
  
        // toy duck behaving like a bird 
        System.out.println("BirdAdapter...");
        adapter.Squeak();
    }


}
