package racingcar.contoller;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private Cars cars;
    private int tryNumber;

    public void play() {
        cars = createCars();
        tryNumber = getTryNumber();
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
