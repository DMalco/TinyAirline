public class Passenger implements Weighable
{
    private String name;
    private int age;
    private int weight;

    public Passenger(String aName, int anAge, int aWeight)
    {
        this.name = aName;
        this.age = anAge;
        this.weight = aWeight;

    }

    public int getWeight()
    {
        return this.weight;
    }

    public String getName()
    {
        return this.name;
    }


}
