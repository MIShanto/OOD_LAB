package Factory;

public class Main 
{
    public static void main(String[] args) 
    {
        BudgetKnifeStore budgetKnifeStore = new BudgetKnifeStore();

        Knife budgetKnife = budgetKnifeStore.orderKnife("Steak");

        System.out.println("We got a "+budgetKnife.knifeType);
    }
}
