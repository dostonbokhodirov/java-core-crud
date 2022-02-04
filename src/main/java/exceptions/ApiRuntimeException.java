package exceptions;

/**
 * @author Doston Bokhodirov, Fri 2:10 AM. 2/4/2022
 */
public class ApiRuntimeException extends RuntimeException {

    public ApiRuntimeException(String message) {
        super(message);
    }
}
