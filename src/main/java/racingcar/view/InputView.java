package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.validator.InputValidator;

import static racingcar.domain.constants.ErrorConst.*;
import static racingcar.domain.constants.InputConst.*;

public class InputView {
    public static String[] requestCarNames() {
        System.out.println(REQUEST_CAR_NAMES);
        String[] carNames = Console.readLine().split(INPUT_SEPARATOR);
        validateCarNames(carNames);
        return carNames;
    }

    private static void validateCarNames(String[] carNames) {
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

    public static int requestTryNumber() {
        System.out.println(REQUEST_TRY_NUMBER);
        String input = Console.readLine();
        validateTryNumber(input);
        return Integer.parseInt(input);
    }

    private static void validateTryNumber(String tryNumber) {
        if(!InputValidator.isInteger(tryNumber)) {
            throw new IllegalArgumentException(TRY_NUMBER_NOT_INTEGER);
        }
        if(!InputValidator.isBiggerThanOne(Integer.parseInt(tryNumber))) {
            throw new IllegalArgumentException(TRY_NUMBER_SMALLER_THAN_ONE);
        }
    }
}
