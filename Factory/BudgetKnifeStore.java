package Factory;

public class BudgetKnifeStore extends KnifeStore
{
    Knife createKnife(String knifeType)
    {
        if(knifeType.equals("Steak"))
            return new BudgetSteakKnife();
        else
            return null;        
    }

}
