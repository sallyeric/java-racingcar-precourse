package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import static org.assertj.core.api.Assertions.assertThat;

public class MoveCarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("sally");
    }

    @Test
    void 랜덤_숫자_4일때_이동() {
        int distance = 4;
        int originalPosition = car.getPosition();
        car.move(distance);
        int movedPosition = car.getPosition();
        assertThat(movedPosition).isEqualTo(originalPosition+distance);
    }

    @Test
    void 랜덤_숫자_9일때_이동() {
        int distance = 9;
        int originalPosition = car.getPosition();
        car.move(distance);
        int movedPosition = car.getPosition();
        assertThat(movedPosition).isEqualTo(originalPosition+distance);
    }

    @Test
    void 랜덤_숫자_10일때_에러발생() {

    }

    @Test
    void 랜덤_숫자_음수일때_에러발생() {

    }

    @Test
    void 랜덤_숫자_3일때_중지() {

    }

    @Test
    void 랜덤_숫자_0일때_중지() {

    }
}
