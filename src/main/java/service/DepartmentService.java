package service;

import dto.department.DepartmentCreateDto;
import dto.department.DepartmentDto;
import dto.department.DepartmentUpdateDto;
import repository.DepartmentRepository;
import response.Data;
import response.ResponseEntity;
import service.base.AbstractService;
import service.base.GenericCrudService;
import service.base.GenericService;
import validator.DepartmentValidator;

import java.util.List;

/**
 * @author Doston Bokhodirov, Fri 3:51 PM. 2/4/2022
 */
public class DepartmentService extends AbstractService<DepartmentRepository, DepartmentValidator>
        implements GenericCrudService<DepartmentCreateDto, DepartmentUpdateDto, Long>,
        GenericService<DepartmentDto, Long> {

    public DepartmentService(DepartmentRepository repository, DepartmentValidator validator) {
        super(repository, validator);
    }

    @Override
    public ResponseEntity<Data<Long>> create(DepartmentCreateDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> update(DepartmentUpdateDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Data<DepartmentDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<DepartmentDto>>> getAll() {
        return null;
    }
}
