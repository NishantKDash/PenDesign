package main.java;

public class PenFactory {

//    public GelPen createGelPen() {
//
//    }

    public static BallPen.BallPenBuilder createBallPen(){
      return new BallPen.BallPenBuilder();
    }

//    public MarkerPen createMarkerPen()
//    {
//
//    }

//    public FountainPen createFountainPen()
//    {
//
//    }
}
