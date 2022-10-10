package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.validator.InputValidator;

import static racingcar.domain.constants.ErrorConst.*;
import static racingcar.domain.constants.InputConst.*;

public class InputView {
    public static String[] requestCarNames() {
        System.out.println(REQUEST_CAR_NAMES);
        String[] carNames = Console.readLine().split(INPUT_SEPARATOR);
        validateInput(carNames);
        return carNames;
    }

    private static void validateInput(String[] carNames) {
        if(InputValidator.isEmpty(carNames)) {
            throw new IllegalArgumentException(CAR_NAMES_EMPTY);
        }
        if(InputValidator.hasDuplicateValue(carNames)) {
            throw new IllegalArgumentException(CAR_NAMES_HAS_DUPLICATE);
        }
        if(InputValidator.isInvalidLength(carNames)) {
            throw new IllegalArgumentException(CAR_NAMES_INVALID_LENGTH);
        }
    }
}
