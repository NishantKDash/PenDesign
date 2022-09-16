package main.java;

import java.util.HashMap;

public class BallPenRegistry {

    private HashMap<String,BallPen> map;


    public BallPenRegistry()
    {
        this.map = new HashMap<>();
    }

    public void addBallPen(String name , BallPen ballPen)
    {
        map.put(name , ballPen);
    }

    public BallPen getBallPen(String name)
    {
        return map.get(name);
    }



}
