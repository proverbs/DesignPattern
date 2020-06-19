package top.proverbs.adapters;

import top.proverbs.round.RoundPeg;
import top.proverbs.square.SquarePeg;

/**
 * Adaptor: extend from the legacy class for same interfaces.
 * */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        // call superclass's default constructor
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
