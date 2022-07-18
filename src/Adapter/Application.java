package Adapter;

public class Application {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(6);
        System.out.println(hole.fits(roundPeg));
        SquarePeg smallSquarePeg = new SquarePeg(2);

        SquarePegAdapter small_squarePeg_adapter = new SquarePegAdapter(smallSquarePeg);
        System.out.println(hole.fits(small_squarePeg_adapter));
    }
}
