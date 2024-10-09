package strategy.circus;

public class Main {

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        scoreBoard.scoreBoardBase = new Clown();
        scoreBoard.showScore(10, 20);

        scoreBoard.scoreBoardBase = new Balloon();
        scoreBoard.showScore(10, 20);

        scoreBoard.scoreBoardBase = new SquareBalloon();
        scoreBoard.showScore(10, 20);
    }
}
