package ui;

import dto.user.UserDto;
import exceptions.ApiRuntimeException;
import response.Data;
import response.ResponseEntity;
import service.UserService;
import ui.base.AbstractUI;
import uz.jl.utils.Color;
import uz.jl.utils.Input;

/**
 * @author Doston Bokhodirov, Fri 4:02 PM. 2/4/2022
 */
public class UserUI extends AbstractUI<UserService> {

    public UserUI(UserService service) {
        super(service);
    }

    public void get() {
        try {
            String id = Input.getStr("Enter user id: ");
            ResponseEntity<Data<UserDto>> response = service.get(Long.parseLong(id));
            showResponse(Color.GREEN, response.getBody());
        } catch (ApiRuntimeException e) {
            showResponse(e.getMessage());
        }
    }
}
