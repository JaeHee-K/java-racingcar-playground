import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarActivityTest {
    CarActivity carActivity;
    RacingCar[] cars;

    @BeforeEach
    void init(){
        cars = new RacingCar[3];
        cars[0] = new RacingCar("car1", 0);
        cars[1] = new RacingCar("car2", 0);
        cars[2] = new RacingCar("car3", 0);

        carActivity = new CarActivity(cars, 5);
    }

    @Test
    @RepeatedTest(10)
    void 랜덤숫자_0_9확인() {
        int value = carActivity.randomValue();
        boolean verify = false;

        if(value >= 0 && value <=9)
            verify = true;

        assertTrue(verify);
    }

    @Test
    void 정확한_거리계산_테스트() {
        carActivity.countDistance(0, 5);
        carActivity.countDistance(0, 0);
        carActivity.countDistance(1, 2);
        carActivity.countDistance(1, 3);
        carActivity.countDistance(2, 9);
        carActivity.countDistance(2, 4);

        assertEquals(cars[0].distance, 1);
        assertEquals(cars[1].distance, 0);
        assertEquals(cars[2].distance, 2);
    }

    @Test
    void 메인_메소드_정상동작_테스트() {
        carActivity.carRacing();
    }
}