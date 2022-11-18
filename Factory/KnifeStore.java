package Factory;

public abstract class KnifeStore 
{
    public Knife orderKnife(String knifeType) 
    {
        Knife knife;

        knife = createKnife(knifeType);

        knife.Sharpen();
        knife.Polish();
        knife.SetKnifeType();

        return knife;
    }

    abstract Knife createKnife(String knifeType);

}
