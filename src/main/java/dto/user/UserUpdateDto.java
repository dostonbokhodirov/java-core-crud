package dto.user;

import com.google.gson.annotations.SerializedName;
import dto.GenericDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Doston Bokhodirov, Fri 11:31 AM. 2/4/2022
 */
@Getter
@Setter
@Builder(builderMethodName = "childBuilder")
public class UserUpdateDto extends GenericDto {

    @SerializedName("first_name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;

    private String username;

    @SerializedName("depart_id")
    private Long departId;

}
