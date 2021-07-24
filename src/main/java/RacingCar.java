import java.util.Arrays;

public class RacingCar {
    public String name;
    public int distance;

    public RacingCar(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public RacingCar(){}

    public static void racingStart(){
        InputCar inputCar = new InputCar();
        inputCar.inputMain();

        RacingCar[] cars = inputCar.getCarStorage();
        int count = inputCar.getCountStorage();

        CarActivity carActivity = new CarActivity(cars, count);
        carActivity.carRacing();

        Judgement judgement = new Judgement();
        judgement.refereeRacing(cars);

        ResultRacing resultRacing = new ResultRacing();
        resultRacing.ResultRacing(cars);
    }

    public static void main(String[] args) {
        racingStart();
    }
}
