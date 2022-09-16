package main.java;

import main.java.stratergies.writeStratergies.WriteBehaviour;

public class BallPen extends Pen implements HasRefill{

    private Refill refill;
    private boolean canChangeRefill;


    private BallPen(WriteBehaviour writeBehaviour)
    {
        super(PenType.BALL ,  writeBehaviour);

    }

    public static class BallPenBuilder {
        private Refill refill;
        private boolean canChangeRefill = false;

        public BallPenBuilder setRefill(Refill refill)
        {
            this.refill = refill;
            return this;
        }

        public BallPenBuilder setCanChangeRefill(boolean value)
        {
            this.canChangeRefill = value;
            return this;
        }

        public BallPen build(WriteBehaviour writeBehaviour)
        {
            BallPen ballPen = new BallPen(writeBehaviour);
            ballPen.refill = this.refill;
            ballPen.canChangeRefill = this.canChangeRefill;
            return ballPen;
        }


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
        return this.canChangeRefill;
    }

    @Override
    public void changeRefill(Refill refill) {
       this.refill = refill;
    }
}
