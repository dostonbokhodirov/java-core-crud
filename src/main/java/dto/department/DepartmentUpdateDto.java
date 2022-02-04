package dto.department;

import com.google.gson.annotations.SerializedName;
import dto.GenericDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Doston Bokhodirov, Fri 11:42 AM. 2/4/2022
 */
@Getter
@Setter
@Builder(builderMethodName = "childBuilder")
public class DepartmentUpdateDto extends GenericDto {

    private String name;

    @SerializedName("phone_number")
    private String phoneNumber;

}
