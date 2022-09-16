package main.java;

public interface HasRefill {

    Refill getRefill();

    boolean  canChangeRefill();

    void changeRefill(Refill refill);


    //This does not violate interface segregation as the three methods are linked to each other. They are
    // not different.
}
