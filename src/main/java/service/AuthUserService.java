package service;

import dto.user.UserDto;
import enums.HttpStatus;
import exceptions.ApiRuntimeException;
import exceptions.CustomSQLException;
import repository.AuthUserRepository;
import response.Data;
import response.ResponseEntity;
import security.SecurityHolder;
import service.base.AbstractService;
import validator.UserValidator;

/**
 * @author Doston Bokhodirov, Fri 3:53 PM. 2/4/2022
 */
public class AuthUserService extends AbstractService<AuthUserRepository, UserValidator> {
    public AuthUserService(AuthUserRepository repository, UserValidator validator) {
        super(repository, validator);
    }

    public ResponseEntity<Data<UserDto>> login(String username, String password) {
        try {
            UserDto dto = repository.login(username, password);
            SecurityHolder.setSessionUser(dto);
            return new ResponseEntity<>(new Data<>(dto));
        } catch (CustomSQLException e) {
            throw new ApiRuntimeException(e.getFriendlyMessage(), HttpStatus.HTTP_400);
        }
    }
}
