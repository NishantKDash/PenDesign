package main.java;

public abstract class Refill {

    protected Ink ink;
    protected RefillType refillType;
    protected Nib nib;

    public Refill(RefillType refillType)
    {
        this.refillType = refillType;

    }

    public abstract Color getColor();
    public abstract int getLeftOverInk();


}
