package dto.user;

import com.google.gson.annotations.SerializedName;
import dto.GenericDto;
import lombok.*;

/**
 * @author Doston Bokhodirov, Fri 11:34 AM. 2/4/2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderMethodName = "childBuilder")
public class UserDto extends GenericDto {

    @SerializedName("first_name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;

    private String username;

    private Integer status;

    @SerializedName("is_deleted")
    private Boolean isDeleted = false;

    @SerializedName("depart_id")
    private Long departId;

    private String role;

}
