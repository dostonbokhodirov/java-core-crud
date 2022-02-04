package service;

import dto.user.UserCreateDto;
import dto.user.UserDto;
import dto.user.UserUpdateDto;
import enums.HttpStatus;
import exceptions.ApiRuntimeException;
import exceptions.CustomSQLException;
import repository.UserRepository;
import response.Data;
import response.ResponseEntity;
import security.SecurityHolder;
import service.base.AbstractService;
import service.base.GenericCrudService;
import service.base.GenericService;
import validator.UserValidator;

import java.sql.SQLException;
import java.util.List;

import static security.SecurityHolder.session;

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
            throw new ApiRuntimeException(e.getMessage(), e.getStatus());
        }
    }

    @Override
    public ResponseEntity<Data<Boolean>> update(UserUpdateDto dto) {
        try {
            validator.validOnUpdate(dto);
            return new ResponseEntity<>(new Data<>(repository.update(dto)));
        } catch (CustomSQLException e){
            throw new ApiRuntimeException(e.getMessage(), e.getStatus());
        }
    }

    @Override
    public ResponseEntity<Data<Boolean>> delete(Long id) {
        try {
            return new ResponseEntity<>(new Data<>(repository.delete(id)));
        } catch (CustomSQLException e){
            throw new ApiRuntimeException(e.getMessage(), HttpStatus.HTTP_400);
        }
    }

    @Override
    public ResponseEntity<Data<UserDto>> get(Long id) {
        try {
            return new ResponseEntity<>(new Data<>(repository.get(id)));
        } catch (CustomSQLException e) {
            throw new ApiRuntimeException(e.getMessage(), e.getStatus());
        }
    }

    @Override
    public ResponseEntity<Data<List<UserDto>>> getAll() {
        return null;
    }

    public ResponseEntity<Data<List<UserDto>>> listOfMembers(Long id) {
        try {
            return new ResponseEntity<>(new Data<>(repository.listOfUsers(id)));
        } catch (CustomSQLException e) {
            throw new ApiRuntimeException(e.getMessage(), e.getStatus());
        }
    }


    public ResponseEntity<Data<Boolean>> blockUser(Long id) {
        try {
            return new ResponseEntity<>(new Data<>(repository.block(id)));
        } catch (CustomSQLException e){
            throw new ApiRuntimeException(e.getMessage(), HttpStatus.HTTP_400);
        }
    }

    public ResponseEntity<Data<Boolean>> unBlockUser(Long id) {
        try {
            return new ResponseEntity<>(new Data<>(repository.unBlock(id)));
        } catch (CustomSQLException e){
            throw new ApiRuntimeException(e.getMessage(), HttpStatus.HTTP_400);
        }
    }
}
