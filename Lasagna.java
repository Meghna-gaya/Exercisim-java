public class Lasagna {
    public int expectedMinutesInOven()
    {
        return 40;
    }
    public int remainingMinutesInOven(int r)
    {
        return 40 - r;
    }
    public int preparationTimeInMinutes(int layers)
    {
        return layers*2;
    }
    public int totalTimeInMinutes(int layers, int t)
    {
        return layers*2 + t;
    }
}