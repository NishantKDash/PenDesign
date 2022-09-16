package main.java;

public class MarkerPen extends Pen implements HasRefill{

    public MarkerPen()
    {
        super(PenType.MARKER);
    }

    public void write()
    {

    }
    public Color getColor()
    {
        return null;
    }

    @Override
    public Refill getRefill() {
        return null;
    }

    @Override
    public boolean canChangeRefill() {
        return false;
    }

    @Override
    public void changeRefill(Refill refill) {

    }
}
