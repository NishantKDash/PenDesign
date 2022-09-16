package main.java;

import javax.swing.plaf.synth.ColorType;

public class BallPenRefill extends Refill {

    protected Ink ink;
    protected RefillType refillType;
    protected Nib nib;
    public BallPenRefill()
    {
        super(RefillType.BALL);

    }

    public static class BallPenRefillBuilder {

        private Ink ink;
        private RefillType refillType;
        private Nib nib;

        public BallPenRefillBuilder setInk(Ink ink)
        {
            this.ink = ink;
            return this;
        }

        public BallPenRefillBuilder setRefillType(RefillType refillType)
        {
            this.refillType = refillType;
            return this;
        }

        public BallPenRefillBuilder setNib(Nib nib)
        {
            this.nib = nib;
            return this;
        }

        public BallPenRefill build()
        {
            BallPenRefill ballPenRefill = new BallPenRefill();
            ballPenRefill.ink = this.ink;
            ballPenRefill.refillType = this.refillType;
            ballPenRefill.nib = this.nib;
            return ballPenRefill;
        }

    }
    @Override
    public Color getColor() {
        return ink.getColor();
    }

    @Override
    public int getLeftOverInk() {
        return 0;
    }
}
