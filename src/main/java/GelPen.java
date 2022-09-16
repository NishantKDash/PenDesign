package main.java;

public class GelPen extends Pen implements HasRefill{

    Refill refill;
    public GelPen(Color color , int density , int radius)
    {
        super(PenType.GEL);
        this.refill = new GelPenRefill(color , density , radius);
    }
    public void write()
    {

    }
    public Color getColor()
    {
        return refill.getColor();
    }

    @Override
    public Refill getRefill() {
        return refill;
    }

    @Override
    public boolean canChangeRefill() {
        return true;
    }

    @Override
    public void changeRefill(Refill refill) {

    }
}
