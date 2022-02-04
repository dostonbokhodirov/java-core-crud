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
    private String friendlyMessage;

    public CustomSQLException(String message, HttpStatus status) {
        super(message, status);
        this.friendlyMessage = message;
        initMessage();
    }

    public CustomSQLException(String message, Throwable cause) {
        super(message, cause);
    }

    private void initMessage() {
        if (friendlyMessage.contains("ERROR_CODE_INTERNAL"))
            super.setStatus(HttpStatus.HTTP_500);
        else if (friendlyMessage.contains("ERROR_CODE_BAD_REQUEST"))
            super.setStatus(HttpStatus.HTTP_400);
        else
            super.setStatus(HttpStatus.UNDEFINED);
    }
}
