package repository;

import com.google.gson.reflect.TypeToken;
import dto.user.UserCreateDto;
import dto.user.UserDto;
import dto.user.UserUpdateDto;
import lombok.SneakyThrows;
import repository.base.AbstractRepository;
import repository.base.GenericCrudRepository;
import security.SecurityHolder;

import java.util.List;

/**
 * @author Doston Bokhodirov, Fri 11:27 AM. 2/4/2022
 */
public class UserRepository extends AbstractRepository
        implements GenericCrudRepository<UserDto, UserCreateDto, UserUpdateDto, Long> {
    @Override
    public Long create(UserCreateDto dto) {
        prepareArguments(gson.toJson(dto), sessionUserId());
        return callProcedure(property.get("user.create"), Long.class);
    }

    @Override
    public Boolean update(UserUpdateDto dto) {
        prepareArguments(gson.toJson(dto), sessionUserId());
        return callProcedure(property.get("user.update"), Boolean.class);
    }

    @Override
    public Boolean delete(Long id) {
        prepareArguments(id, sessionUserId());
        return callProcedure(property.get("user.delete"), Boolean.class);
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

    public List<UserDto> listOfUsers(Long id) {
        prepareArguments(id, sessionUserId());
        String jsonDATA = callProcedure(property.get("user.getAll"), String.class);
        return gson.fromJson(jsonDATA, new TypeToken<List<UserDto>>() {
        }.getType());
    }

    public Boolean block(Long id) {
        prepareArguments(id, sessionUserId());
        return callProcedure(property.get("user.block"), Boolean.class);
    }

    public Boolean unBlock(Long id) {
        prepareArguments(id, sessionUserId());
        return callProcedure(property.get("user.unblock"), Boolean.class);
    }
}
