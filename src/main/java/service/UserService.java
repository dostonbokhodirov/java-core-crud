package service;

import dto.user.UserCreateDto;
import dto.user.UserDto;
import dto.user.UserUpdateDto;
import exceptions.ApiRuntimeException;
import exceptions.CustomSQLException;
import repository.UserRepository;
import response.Data;
import response.ResponseEntity;
import service.base.AbstractService;
import service.base.GenericCrudService;
import service.base.GenericService;
import validator.UserValidator;

import java.util.List;

/**
 * @author Doston Bokhodirov, Fri 3:47 PM. 2/4/2022
 */
public class UserService extends AbstractService<UserRepository, UserValidator>
        implements GenericCrudService<UserCreateDto, UserUpdateDto, Long>,
        GenericService<UserDto, Long> {

    public UserService(UserRepository repository, UserValidator validator) {
        super(repository, validator);
    }

    @Override
    public ResponseEntity<Data<Long>> create(UserCreateDto dto) {
        try {
            return new ResponseEntity<>(new Data<>(repository.create(dto)));
        } catch (CustomSQLException e) {
            throw new ApiRuntimeException(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<Data<Boolean>> update(UserUpdateDto dto) {
        try {
            validator.validOnUpdate(dto);
            return new ResponseEntity<>(new Data<>(repository.update(dto)));
        } catch (CustomSQLException e) {
            throw new ApiRuntimeException(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<Data<Boolean>> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Data<UserDto>> get(Long id) {
        try {
            return new ResponseEntity<>(new Data<>(repository.get(id)));
        } catch (CustomSQLException e) {
            throw new ApiRuntimeException(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<Data<List<UserDto>>> getAll() {
        return null;
    }


}
