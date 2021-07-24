import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringAddCalculatorTest {
    StringAddCalculator stringAddCalculator = new StringAddCalculator();
    @Test
    public void 빈문자열_또는_null() {
        int value = stringAddCalculator.calculate("");
        assertThat(value).isEqualTo(0);

        value = stringAddCalculator.calculate(null);
        assertThat(value).isEqualTo(0);
    }

    @Test
    public void 하나의_숫자_입력() throws Exception{
        int value = stringAddCalculator.calculate("3");
        assertThat(value).isEqualTo(3);

        value = stringAddCalculator.calculate("5");
        assertThat(value).isEqualTo(5);
    }

    @Test
    public void 구분자_콤마() throws Exception{
        int value = stringAddCalculator.calculate("1,2");
        assertThat(value).isEqualTo(3);

        value = stringAddCalculator.calculate("3,6");
        assertThat(value).isEqualTo(9);
    }

    @Test
    public void 구분자_콤마_또는_콜론() throws Exception{
        int value = stringAddCalculator.calculate("1,2:3");
        assertThat(value).isEqualTo(6);

        value = stringAddCalculator.calculate("2:3:4");
        assertThat(value).isEqualTo(9);

        value = stringAddCalculator.calculate("3:4,5");
        assertThat(value).isEqualTo(12);
    }

    @Test
    public void 구분자_커스텀() throws Exception{
        int value = stringAddCalculator.calculate("//;//1;2;3");
        assertThat(value).isEqualTo(6);

        value = stringAddCalculator.calculate("//-//3-4-5");
        assertThat(value).isEqualTo(12);
    }

    @Test()
    public void 잘못된_입력_검증() throws Exception{
        stringAddCalculator.calculate("-1,2,3");
//        Assertions.assertThrows(NoSuchElementException.class, () -> {
//            stringAddCalculator.calculate("-1,2,3");
//        });
    }
}