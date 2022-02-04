package repository;

import dto.user.UserDto;
import repository.base.AbstractRepository;
import settings.Types;

/**
 * @author Doston Bokhodirov, Fri 11:26 AM. 2/4/2022
 */
public class AuthUserRepository extends AbstractRepository {

    public UserDto login(String username, String password) {
        prepareArguments(username, password);
        String jsonDATA = (String) callProcedure(property.get("auth.login"), Types.VARCHAR);
        return gson.fromJson(jsonDATA, UserDto.class);
    }


}
