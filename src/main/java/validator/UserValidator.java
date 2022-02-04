package validator;

import dto.user.UserCreateDto;
import dto.user.UserUpdateDto;
import validator.base.GenericValidator;

/**
 * @author Doston Bokhodirov, Fri 2:51 PM. 2/4/2022
 */
public class UserValidator extends GenericValidator<UserCreateDto, UserUpdateDto, Long> {
    @Override
    public void validKey(Long id) {

    }

    @Override
    public void validOnCreate(UserCreateDto dto) {

    }

    @Override
    public void validOnUpdate(UserUpdateDto dto) {

    }
}
