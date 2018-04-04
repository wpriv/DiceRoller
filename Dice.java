import java.util.*;

public class Dice
{
    private int sides;
    Random rng = new Random();

    //constructors
    Dice()
    {
        sides = 20;
    }

    Dice(int s)
    {
        sides = s;
    }

    //functionality
    public void roll(int times)
    {
        int result;
        for(int i = 0; i < times; i++)
        {
            result = rng.nextInt(sides);
            System.out.println(result);
        }
    }



    //getters + setters
    public void setSides(int s)
    {
        sides = s;
    }

    public int getSides()
    {
        return sides;
    }
}
