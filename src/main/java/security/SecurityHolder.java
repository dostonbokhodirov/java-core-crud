package security;

import dto.user.UserDto;

/**
 * @author Doston Bokhodirov, Fri 2:00 AM. 2/4/2022
 */
public class SecurityHolder {
    public static UserDto session;

    public static void setSessionUser(UserDto authUser) {
        session = authUser;
    }

    public static void killSession() {
        session = null;
    }
}
