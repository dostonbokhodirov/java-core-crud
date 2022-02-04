package dto.user;

import com.google.gson.annotations.SerializedName;
import dto.BaseGenericDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Doston Bokhodirov, Fri 11:29 AM. 2/4/2022
 */
@Getter
@Setter
@Builder(builderMethodName = "childBuilder")
public class UserCreateDto implements BaseGenericDto {

    @SerializedName("first_name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;

    private String username;

    private String password;

    @SerializedName("depart_id")
    private Long departId;

}
