import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JudgementTest {
    RacingCar[] cars = new RacingCar[3];
    Judgement judgement = new Judgement();

    @Test
    void car1_우승() {
        cars[0] = new RacingCar("car1", 5);
        cars[1] = new RacingCar("car2", 1);
        cars[2] = new RacingCar("car3", 4);

        List<String> actualWinner = new ArrayList<>();
        List<String> predWinner;

        actualWinner.add("car1");
        predWinner = judgement.refereeRacing(cars);

        assertEquals(actualWinner, predWinner);
    }

    @Test
    void car2_우승() {
        cars[0] = new RacingCar("car1", 1);
        cars[1] = new RacingCar("car2", 7);
        cars[2] = new RacingCar("car3", 2);

        List<String> actualWinner = new ArrayList<>();
        List<String> predWinner;

        actualWinner.add("car2");
        predWinner = judgement.refereeRacing(cars);

        assertEquals(actualWinner, predWinner);
    }

    @Test
    void car1과_car3_우승() {
        cars[0] = new RacingCar("car1", 6);
        cars[1] = new RacingCar("car2", 3);
        cars[2] = new RacingCar("car3", 6);

        List<String> actualWinner = new ArrayList<>();
        List<String> predWinner;

        actualWinner.add("car1");
        actualWinner.add("car3");
        predWinner = judgement.refereeRacing(cars);

        assertEquals(actualWinner, predWinner);
    }
}