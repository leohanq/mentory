package strategy.circus;

public class Balloon extends ScoreBoardBase {
    @Override
    public int calculateStore(int taps, int muliplier) {
        return (taps * muliplier) - 20;
    }
}
