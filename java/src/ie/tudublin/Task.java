package ie.tudublin;

import processing.core.PApplet;

//class called Task
public class Task
{
    public int Start;
    public int End;



    public Color(int Start, int End)
    {
        this.Start = Start;
        this.End = End;

    }

    //constuctor that takes processing table row as a parameter
    private Task(TableRow tr)
    {
        this(tr.getInt("Start"), tr.getInt("End"));
    }

    //toString method
    public String toString()
    {
        return this.Start + ", " + this.End;
    }
}