package strategy.circus;

public class ScoreBoard {

    public ScoreBoardBase scoreBoardBase;

    public void showScore(int taps, int multiplier) {
        System.out.println(scoreBoardBase.calculateStore(taps, multiplier));
    }
}
