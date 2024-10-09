package strategy.circus;

public class SquareBalloon extends ScoreBoardBase {
    @Override
    public int calculateStore(int taps, int muliplier) {
        return (taps * muliplier) + 40;
    }
}
