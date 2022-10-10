package racingcar.contoller;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private Cars cars;
    private int tryNumber;
    private int randomDistance;

    public void play() {
        cars = createCars();
        tryNumber = getTryNumber();
        randomDistance = Randoms.pickNumberInRange(0,9);

    }

    private int getTryNumber() {
        return InputView.requestTryNumber();
    }

    private static Cars createCars() {
        List<Car> cars = new ArrayList();
        String[] inputCarNames = InputView.requestCarNames();
        for(String carName : inputCarNames) {
            cars.add(new Car(carName));
        }
        return new Cars(cars);
    }
}
