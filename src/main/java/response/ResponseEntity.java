package response;

import enums.HttpStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Doston Bokhodirov, Fri 11:24 AM. 2/4/2022
 */
@Getter
@Setter
@ToString
public class ResponseEntity<D> {
    private D body;
    private Integer status;

    public ResponseEntity(D body) {
        this(body, HttpStatus.HTTP_200);
    }

    public ResponseEntity(D body, HttpStatus status) {
        this.body = body;
        this.status = status.getCode();
    }
}
