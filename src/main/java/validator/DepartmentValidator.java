package validator;

import dto.department.DepartmentCreateDto;
import dto.department.DepartmentUpdateDto;
import enums.HttpStatus;
import exceptions.ApiRuntimeException;
import validator.base.GenericValidator;

import java.util.Objects;

/**
 * @author Doston Bokhodirov, Fri 2:51 PM. 2/4/2022
 */
public class DepartmentValidator extends GenericValidator<DepartmentCreateDto, DepartmentUpdateDto, Long> {
    @Override
    public void validKey(Long id) {

    }

    @Override
    public void validOnCreate(DepartmentCreateDto dto) {
        if (Objects.isNull(dto.getName()) || Objects.isNull(dto.getPhoneNumber())) {
            throw new ApiRuntimeException("BAD_CREDENTIALS", HttpStatus.HTTP_400);
        }
    }

    @Override
    public void validOnUpdate(DepartmentUpdateDto dto) {

    }
}
