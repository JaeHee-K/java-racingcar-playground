import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RacingCarTest {
    RacingCar[] cars;
    int count;

    @BeforeEach
    void init(){
        cars = new RacingCar[3];
        cars[0] = new RacingCar("car1", 0);
        cars[1] = new RacingCar("car2", 0);
        cars[2] = new RacingCar("car3", 0);

        count = 5;
    }
    @Test
    void 정상동작_테스트() {
        CarActivity carActivity = new CarActivity(cars, count);
        carActivity.carRacing();

        Judgement judgement = new Judgement();
        judgement.refereeRacing(cars);

        ResultRacing resultRacing = new ResultRacing();
        resultRacing.ResultRacing(cars);
    }
}