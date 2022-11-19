package Builder;

public class Main 
{
    public static void main(String[] args) 
    {
        IHouseBuilder iglooBuilder = new IglooHouseBuilder();
        IHouseBuilder tipiBuilder = new TipiHouseBuilder();

        Director director1 = new Director(iglooBuilder);
        Director director2 = new Director(tipiBuilder);

        director1.ConstructHouse();
        director2.ConstructHouse();

        System.out.println("This is an igloo house " + iglooBuilder.getHouse());
        System.out.println("This is a tipi house " + tipiBuilder.getHouse());
    }
}
