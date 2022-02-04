package exceptions;

import enums.HttpStatus;
import lombok.Getter;

/**
 * @author Doston Bokhodirov, Fri 2:09 AM. 2/4/2022
 */
@Getter
public class InvalidInputException extends BaseException {
    private final HttpStatus status;

    public InvalidInputException(String message, HttpStatus status) {
        super(message, status);
        this.status = HttpStatus.HTTP_400;
    }
}
