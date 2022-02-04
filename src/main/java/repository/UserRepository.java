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

import java.util.List;

/**
 * @author Doston Bokhodirov, Fri 11:27 AM. 2/4/2022
 */
public class UserRepository extends AbstractRepository
        implements GenericCrudRepository<UserDto, UserCreateDto, UserUpdateDto, Long>,
        GenericRepository<UserDto, Long> {
    @Override
    public Long create(UserCreateDto dto) {
        return null;
    }

    @Override
    public Void update(UserUpdateDto dto) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @SneakyThrows
    @Override
    public UserDto get(Long id) {
            prepareArguments(id);
            String jsonDATA = callProcedure(property.get("user.get"), String.class);
            return gson.fromJson(jsonDATA, UserDto.class);
    }

    @Override
    public List<UserDto> getAll() {
        return null;
    }
}
