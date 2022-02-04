package ui;

import dto.user.UserDto;
import dto.user.UserUpdateDto;
import exceptions.ApiRuntimeException;
import response.Data;
import response.ResponseEntity;
import service.UserService;
import ui.base.AbstractUI;
import uz.jl.utils.Color;
import uz.jl.utils.Input;

import java.util.Locale;

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

    public void update() {
        UserUpdateDto dto = new UserUpdateDto();

        String id = Input.getStr("User id ->");
        dto.setId(Long.parseLong(id));

        String uname = Input.getStr("Do you wanna change Username? YES/NO");
        if(uname.toLowerCase(Locale.ROOT).startsWith("y")){
            String username = Input.getStr("Username -> ");
            dto.setUsername(username);
        }
        String fname = Input.getStr("Do you wanna change First name? YES/NO");
        if (fname.toLowerCase(Locale.ROOT).startsWith("y")){
            String firstName = Input.getStr("First name -> ");
            dto.setFirstName(firstName);
        }
        String lname = Input.getStr("Do you wanna change Last name? YES/NO");
        if(lname.toLowerCase(Locale.ROOT).startsWith("y")){
            String lastName = Input.getStr("Last name -> ");
            dto.setLastName(lastName);
        }
        String dep = Input.getStr("Do you wanna change Department id? YES/NO");
        if (dep.toLowerCase(Locale.ROOT).startsWith("y")){
            String depId = Input.getStr("Depart id -> ");
            dto.setDepartId(Long.parseLong(depId));
        }

        ResponseEntity<Data<Void>> response = service.update(dto);
        showResponse(Color.GREEN,response.getBody());
    }

    public void create() {
    }

    public void delete() {

    }
}
