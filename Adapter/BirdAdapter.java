package Adapter;

public class BirdAdapter implements IToyDuck
{
    IBird bird;

    BirdAdapter(IBird bird)
    {
        this.bird = bird;
    }

    @Override
    public void Squeak() 
    {
        bird.MakeSound();
        
    }
}
