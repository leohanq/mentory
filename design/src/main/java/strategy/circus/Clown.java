package strategy.circus;

public class Clown extends ScoreBoardBase {


    @Override
    public int calculateStore(int taps, int muliplier) {
        return (taps * muliplier) - 10;
    }
}
