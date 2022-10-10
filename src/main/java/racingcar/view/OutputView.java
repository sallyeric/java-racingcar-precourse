package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import static racingcar.domain.constants.OutputConst.EXECUTION_RESULT_INSTRUCTION;

public class OutputView {
    public static void printExecutionResultInstruction() {
        System.out.println(EXECUTION_RESULT_INSTRUCTION);
    }

    public static void printExecutionResult(Cars cars) {
        for(Car car: cars.getCars()) {
            String racedCar = "";
            racedCar += car.getName();
            racedCar += ": ";
            for(int i = 0; i < car.getPosition(); i++) {
                racedCar+="-";
            }
            System.out.println(racedCar);
        }
        System.out.println();
    }
}
