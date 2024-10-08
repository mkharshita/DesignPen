package pens;

import utils.Cap;
import writeStrategy.WriteStrategy;

public abstract class Pen {

    private WriteStrategy writeStrategy;
    private String name;
    private Cap cap;
    private String brand;
    private double length;

    public Pen(WriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
    }

    public WriteStrategy getWriteStrategy() {
        return writeStrategy;
    }

    public void setWriteStrategy(WriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cap getCap() {
        return cap;
    }

    public void setCap(Cap cap) {
        this.cap = cap;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public abstract void write();
}
