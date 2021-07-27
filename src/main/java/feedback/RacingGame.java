package feedback;

public class RacingGame {
    public static void main(String[] args) {
        InputCar inputCar = new InputCar();
        inputCar.Begin();

        StartRacing startRacing = new StartRacing();
        startRacing.start();

        Judgement judgement = new Judgement();
        ViewStatus viewStatus = new ViewStatus();
        viewStatus.winnerView(judgement.findWinners());
    }
}
