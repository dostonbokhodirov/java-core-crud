package response;

import lombok.Getter;
import lombok.ToString;

/**
 * @author Doston Bokhodirov, Fri 11:24 AM. 2/4/2022
 */
@Getter
@ToString
public class Data<B> {
    private final B data;
    private final Integer total;

    public Data(B data) {
        this(data, 1);
    }

    public Data(B data, Integer total) {
        this.data = data;
        this.total = total;
    }
}