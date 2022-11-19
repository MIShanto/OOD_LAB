package Builder;

public class Director
{
    IHouseBuilder houseBuilder;
    Director(IHouseBuilder houseBuilder)
    {
        this.houseBuilder = houseBuilder;
    }
    void ConstructHouse()
    {
        houseBuilder.buildBasement();
        houseBuilder.buildBasement();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
    }
    
}
