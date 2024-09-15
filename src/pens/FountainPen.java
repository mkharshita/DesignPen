package pens;

import utils.Ink;
import utils.Nib;
import writeStrategy.WriteStrategy;

public class FountainPen extends Pen{
    private Ink ink;
    private Nib nib;

    public FountainPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Nib getNib() {
        return nib;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }

    @Override
    public void write() {

    }
}

