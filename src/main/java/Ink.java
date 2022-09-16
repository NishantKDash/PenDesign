package main.java;

public class Ink {
    private Color color;
    private InkType inkType;
    private int density;


    public Ink(Color color , int density , InkType inkType)
    {
        this.color = color;
        this.density = density;
        this.inkType = inkType;
    }

    public Color getColor()
    {
        return this.color;
    }


}
