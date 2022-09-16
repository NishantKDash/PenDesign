package main.java;

import main.java.stratergies.writeStratergies.SmoothWriteBehaviour;

public class Client {

    public static void main(String[] args) {

        BallPenRegistry obj = new BallPenRegistry();

        BallPen natrajballPen =
                PenFactory.createBallPen()
                        .setRefill(RefillFactory
                                .createBallPenRefill()
                                .setInk(new Ink(Color.BLACK , 20 , InkType.OIL))
                                .setRefillType(RefillType.BALL)
                                .setNib(new Nib(12 , NibType.BALL))
                                .build())
                        .setCanChangeRefill(true).build(new SmoothWriteBehaviour());

        obj.addBallPen("Natraj" , natrajballPen);

        BallPen reynoldsballPen =
                PenFactory.createBallPen()
                        .setRefill(RefillFactory
                                .createBallPenRefill()
                                .setInk(new Ink(Color.BLACK , 20 , InkType.OIL))
                                .setRefillType(RefillType.BALL)
                                .setNib(new Nib(12 , NibType.BALL))
                                .build())
                        .setCanChangeRefill(true).build(new SmoothWriteBehaviour());

        obj.addBallPen("Reynolds" , reynoldsballPen);
    }
}
