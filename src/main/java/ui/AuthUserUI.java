package ui;

import service.AuthUserService;
import ui.base.AbstractUI;

/**
 * @author Doston Bokhodirov, Fri 4:01 PM. 2/4/2022
 */
public class AuthUserUI extends AbstractUI<AuthUserService> {

    public AuthUserUI(AuthUserService service) {
        super(service);
    }


}
