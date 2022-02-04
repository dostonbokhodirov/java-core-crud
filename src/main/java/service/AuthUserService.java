package service;

import dto.user.UserDto;
import repository.AuthUserRepository;
import response.Data;
import response.ResponseEntity;
import service.base.AbstractService;
import validator.UserValidator;

/**
 * @author Doston Bokhodirov, Fri 3:53 PM. 2/4/2022
 */
public class AuthUserService extends AbstractService<AuthUserRepository, UserValidator> {
    public AuthUserService(AuthUserRepository repository, UserValidator validator) {
        super(repository, validator);
    }

    ResponseEntity<Data<UserDto>> login(String username, String password) {
        return null;
    }
}
