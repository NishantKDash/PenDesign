package main.java;

public class GelPenRefill extends Refill{

    public GelPenRefill(Color color , int density , int radius)
    {
        super(RefillType.GEL , new Ink(color ,density ,  InkType.GEL) , new Nib(radius , NibType.GEL));
    }
    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int getLeftOverInk() {
        return 0;
    }
}
