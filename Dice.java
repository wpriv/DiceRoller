import java.util.*;

public class Dice
{
    private int sides;
    private String name;
    Random rng = new Random();

    //constructors
    Dice()
    {
        sides = 20;
        name = "none";
    }

    Dice(int s)
    {
        sides = s;
        name = "none";
    }

    Dice(String n)
    {
        sides = 20;
        name = n;
    }

    Dice(int s, String n)
    {
        sides = s;
        name = n;
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

    public void setName(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }
}
