package repository;

import com.google.gson.reflect.TypeToken;
import dto.department.DepartmentCreateDto;
import dto.department.DepartmentDto;
import dto.department.DepartmentUpdateDto;
import repository.base.AbstractRepository;
import repository.base.GenericCrudRepository;
import repository.base.GenericRepository;
import settings.Types;

import java.util.List;

/**
 * @author Doston Bokhodirov, Fri 11:46 AM. 2/4/2022
 */
public class DepartmentRepository extends AbstractRepository
        implements GenericCrudRepository<DepartmentDto, DepartmentCreateDto, DepartmentUpdateDto, Long>,
        GenericRepository<DepartmentDto, Long> {

    @Override
    public Long create(DepartmentCreateDto dto) {
        prepareArguments(gson.toJson(dto), sessionUserId());
        return (Long) callProcedure(property.get("department.create"), Types.BIGINT);
    }

    @Override
    public Boolean update(DepartmentUpdateDto dto) {
        prepareArguments(gson.toJson(dto), sessionUserId());
        return (Boolean) callProcedure(property.get("department.update"), Types.BOOLEAN);
    }

    @Override
    public Boolean delete(Long id) {
        prepareArguments(id, sessionUserId());
        return (Boolean) callProcedure(property.get("department.delete"), Types.BOOLEAN);
    }

    @Override
    public DepartmentDto get(Long id) {
        prepareArguments(id, sessionUserId());
        String jsonData = (String) callProcedure(property.get("department.get"), Types.VARCHAR);
        return gson.fromJson(jsonData, DepartmentDto.class);
    }

    @Override
    public List<DepartmentDto> getAll() {
        prepareArguments(sessionUserId());
        String jsonData = (String) callProcedure(property.get("department.getAll"), Types.VARCHAR);
        return gson.fromJson(jsonData, new TypeToken<List<DepartmentDto>>() {
        }.getType());
    }

    public Boolean block(Long id) {
        prepareArguments(id, sessionUserId());
        return (Boolean) callProcedure(property.get("department.block"), Types.BOOLEAN);
    }

    public Boolean unblock(Long id) {
        prepareArguments(id, sessionUserId());
        return (Boolean) callProcedure(property.get("department.unblock"), Types.BOOLEAN);
    }
}
