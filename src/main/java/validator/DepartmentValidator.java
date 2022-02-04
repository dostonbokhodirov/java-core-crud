package validator;

import dto.department.DepartmentCreateDto;
import dto.department.DepartmentUpdateDto;
import validator.base.GenericValidator;

/**
 * @author Doston Bokhodirov, Fri 2:51 PM. 2/4/2022
 */
public class DepartmentValidator extends GenericValidator<DepartmentCreateDto, DepartmentUpdateDto, Long> {
    @Override
    public void validKey(Long id) {

    }

    @Override
    public void validOnCreate(DepartmentCreateDto dto) {

    }

    @Override
    public void validOnUpdate(DepartmentUpdateDto dto) {

    }
}
