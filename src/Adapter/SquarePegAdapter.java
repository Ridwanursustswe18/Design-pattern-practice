package Adapter;
import  java.lang.Math;

import static java.lang.Math.sqrt;

public class SquarePegAdapter extends RoundPeg{
    public SquarePeg peg;
    public SquarePegAdapter(SquarePeg peg){
        super();
        this.peg = peg;
    }
    @Override
    public double getRadius(){
        return peg.getWidth()*sqrt(2)/2;
    }
}
