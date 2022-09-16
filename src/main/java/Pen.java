package main.java;

import main.java.stratergies.writeStratergies.WriteBehaviour;

public abstract class Pen {
    private String name;
    private String company;
    private Integer price;
    private PenType type;

    private WriteBehaviour writeBehaviour;

    public Pen (PenType penType , WriteBehaviour writeBehaviour)
    {
        this.type = penType;
        this.writeBehaviour = writeBehaviour;
    }
    public  void write(){
        writeBehaviour.write();
    }
    public abstract Color getColor();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public PenType getType() {
        return type;
    }

    public void setType(PenType type) {
        this.type = type;
    }
}
