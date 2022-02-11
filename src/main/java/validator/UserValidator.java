package validator;

import dto.user.UserCreateDto;
import dto.user.UserUpdateDto;
import exceptions.ApiRuntimeException;
import validator.base.GenericValidator;

import java.util.Objects;

/**
 * @author Doston Bokhodirov, Fri 2:51 PM. 2/4/2022
 */
public class UserValidator extends GenericValidator<UserCreateDto, UserUpdateDto, Long> {
    @Override
    public void validKey(Long id) {

    }

    @Override
    public void validOnCreate(UserCreateDto dto) {
        if (Objects.isNull(dto.getName()) || Objects.isNull(dto.getPhoneNumber())) {
            throw new ApiRuntimeException("BAD_CREDENTIALS");
        }
    }

    @Override
    public void validOnUpdate(UserUpdateDto dto) {
        if (Objects.isNull(dto.getId())) {
            throw new ApiRuntimeException("BAD_CREDENTIALS");
        }
    }
}
