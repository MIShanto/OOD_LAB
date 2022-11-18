package Factory;

public class BudgetSteakKnife extends Knife
{
    
    void Polish()
    {
        System.out.println("Polishing Budget Steak knife");
    }

   void Sharpen()
   {
        System.out.println("Sharpening Budget Steak knife");
   }
   
   void SetKnifeType()
   {
        knifeType = "Budget Knife";
   }
    
}
