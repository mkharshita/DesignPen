package pens;

import utils.Refil;
import writeStrategy.WriteStrategy;

public class BallPen extends Pen{
    private Refil refil;

    public BallPen(WriteStrategy writeStrategy) {
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
        System.out.println("Writing via Ball Pen");
        getWriteStrategy().writeBehaviour();
    }
}
