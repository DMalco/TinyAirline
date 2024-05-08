public class CheckInDesk
{

    private int totalWeight;
    public CheckInDesk()
    {
        totalWeight = 0;
    }

    public void add(Weighable w)
    {
        this.totalWeight += w.getWeight();
    }

    public void add(Passenger p)// Method overloading
    {
        this.totalWeight = p.getWeight();
    }


}
