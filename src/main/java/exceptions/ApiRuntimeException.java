package exceptions;

import enums.HttpStatus;
import lombok.Getter;

/**
 * @author Doston Bokhodirov, Fri 2:10 AM. 2/4/2022
 */
public class ApiRuntimeException extends RuntimeException {
    @Getter
    private final Integer status;

    public ApiRuntimeException(String message, HttpStatus status) {
        super(message);
        this.status = status.getCode();
    }
}
