package repository;

import dto.user.UserDto;
import repository.base.AbstractRepository;

/**
 * @author Doston Bokhodirov, Fri 11:26 AM. 2/4/2022
 */
public class AuthUserRepository extends AbstractRepository {

    public UserDto login(String username, String password) {
        prepareArguments(username, password);
        String jsonData = callProcedure(property.get("auth.login"), String.class);
        return gson.fromJson(jsonData, UserDto.class);
    }

}
