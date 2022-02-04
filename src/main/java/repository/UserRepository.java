package repository;

import dto.user.UserCreateDto;
import dto.user.UserDto;
import dto.user.UserUpdateDto;
import enums.HttpStatus;
import exceptions.CustomSQLException;
import lombok.SneakyThrows;
import repository.base.AbstractRepository;
import repository.base.GenericCrudRepository;
import repository.base.GenericRepository;
import security.SecurityHolder;
import settings.Types;

import java.util.List;

/**
 * @author Doston Bokhodirov, Fri 11:27 AM. 2/4/2022
 */
public class UserRepository extends AbstractRepository
        implements GenericCrudRepository<UserDto, UserCreateDto, UserUpdateDto, Long>,
        GenericRepository<UserDto, Long> {
    @Override
    public Long create(UserCreateDto dto) {
        String json = gson.toJson(dto);
        prepareArguments(json, SecurityHolder.session.getId());
        return (long) callProcedure(property.get("user.create"), java.sql.Types.BIGINT);
    }

    @Override
    public Boolean update(UserUpdateDto dto) {
        prepareArguments(dto, sessionUserId());
        return (Boolean) callProcedure(property.get("user.update"), Types.BOOLEAN);
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @SneakyThrows
    @Override
    public UserDto get(Long id) {
        prepareArguments(id);
        String jsonDATA = (String) callProcedure(property.get("user.get"), Types.VARCHAR);
        return gson.fromJson(jsonDATA, UserDto.class);
    }

    @Override
    public List<UserDto> getAll() {
        return null;
    }

}
