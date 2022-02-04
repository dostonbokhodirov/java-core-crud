package ui;

import dto.department.DepartmentCreateDto;
import dto.department.DepartmentDto;
import exceptions.ApiRuntimeException;
import response.Data;
import response.ResponseEntity;
import service.DepartmentService;
import ui.base.AbstractUI;
import uz.jl.utils.Color;
import uz.jl.utils.Input;

import java.util.List;


/**
 * @author Doston Bokhodirov, Fri 4:04 PM. 2/4/2022
 */
public class DepartmentUI extends AbstractUI<DepartmentService> {

    public DepartmentUI(DepartmentService service) {
        super(service);
    }

    public void create() {
        try {
            String name = Input.getStr("Enter department's name: ");
            String phoneNumber = Input.getStr("Enter department's phone number: ");
            DepartmentCreateDto dto = DepartmentCreateDto
                    .builder()
                    .name(name)
                    .phoneNumber(phoneNumber)
                    .build();
            ResponseEntity<Data<Long>> response = service.create(dto);
            showResponse(Color.GREEN, response.getBody());
        } catch (ApiRuntimeException e) {
            showResponse(e.getMessage());
        }
    }

    public void update() {
        String id = Input.getStr("Enter department's id: ");

    }

    public void delete() {

    }

    public void block() {

    }

    public void unblock() {

    }

    public void get() {
        try {
            String id = Input.getStr("Enter department id: ");
            ResponseEntity<Data<DepartmentDto>> response = service.get(Long.parseLong(id));
            showResponse(Color.GREEN, response.getBody());
        } catch (ApiRuntimeException e) {
            showResponse(e.getMessage());
        }
    }

    public void getAll() {
        try {
            ResponseEntity<Data<List<DepartmentDto>>> response = service.getAll();
            showResponse(Color.GREEN, response.getBody());
        } catch (ApiRuntimeException e) {
            showResponse(e.getMessage());
        }
    }
}
