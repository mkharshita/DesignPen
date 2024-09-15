package pens;

import utils.Refil;
import writeStrategy.WriteStrategy;

public class SketchPen extends Pen{
    private Refil refil;

    public SketchPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    public Refil getRefil() {
        return refil;
    }

    public void setRefil(Refil refil) {
        this.refil = refil;
    }

    @Override
    public void write() {

    }
}

