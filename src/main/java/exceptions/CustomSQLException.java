package exceptions;

import enums.HttpStatus;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Doston Bokhodirov, Fri 2:12 AM. 2/4/2022
 */
@Getter
@Setter
public class CustomSQLException extends BaseException {

    public CustomSQLException(String message, HttpStatus status) {
        super(message, status);
    }

    public CustomSQLException(String message, Throwable cause) {
        super(message, cause);
    }
}
