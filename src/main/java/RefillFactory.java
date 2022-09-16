package main.java;

public class RefillFactory {

    public static BallPenRefill.BallPenRefillBuilder createBallPenRefill()
    {
        return new BallPenRefill.BallPenRefillBuilder();
    }
}
