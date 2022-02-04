package exceptions;

import enums.HttpStatus;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Doston Bokhodirov, Fri 2:07 AM. 2/4/2022
 */
@Getter
@Setter
public class BaseException extends RuntimeException {
    private HttpStatus status;

    public BaseException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public BaseException(String message, Throwable cause, HttpStatus status) {
        super(message, cause);
        this.status = status;
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

}
