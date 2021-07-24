import com.ginsberg.junit.exit.ExpectSystemExit;
import org.junit.jupiter.api.Test;

class InputCarTest {
    InputCar inputCar = new InputCar();

    @Test
    void 길이제한_5글자_성공_예시() {
        String[] names = {"car1","car2","car3","car4"};
        inputCar.namesVerify(names);
    }

    @Test
    @ExpectSystemExit
    void 길이제한_5글자_실패_예시() {
        String[] names = {"car1","car11111","car3","car4"};
        inputCar.namesVerify(names);
    }
}