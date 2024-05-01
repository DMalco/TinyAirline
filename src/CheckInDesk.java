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


}
