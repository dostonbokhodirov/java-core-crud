package repository;

import dto.department.DepartmentCreateDto;
import dto.department.DepartmentDto;
import dto.department.DepartmentUpdateDto;
import repository.base.AbstractRepository;
import repository.base.GenericCrudRepository;
import repository.base.GenericRepository;

import java.util.List;

/**
 * @author Doston Bokhodirov, Fri 11:46 AM. 2/4/2022
 */
public class DepartmentRepository extends AbstractRepository
        implements GenericCrudRepository<DepartmentDto, DepartmentCreateDto, DepartmentUpdateDto, Long>,
        GenericRepository<DepartmentDto, Long> {
    @Override
    public Long create(DepartmentCreateDto dto) {
        return null;
    }

    @Override
    public Void update(DepartmentUpdateDto dto) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public DepartmentDto get(Long id) {
        return null;
    }

    @Override
    public List<DepartmentDto> getAll() {
        return null;
    }
}
