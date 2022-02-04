package ui.base;

import com.google.gson.Gson;
import configs.ApplicationContextHolder;
import service.base.BaseGenericService;
import uz.jl.utils.Color;
import uz.jl.utils.Print;

/**
 * @author Doston Bokhodirov, Fri 3:58 PM. 2/4/2022
 */
public abstract class AbstractUI<S extends BaseGenericService> {
    protected S service;

    public AbstractUI(S service) {
        this.service = service;
    }

    protected <T> void showResponse(T response) {
        showResponse(Color.RED, response);
    }

    protected <T> void showResponse(String color, T response) {
        Print.println(color, ApplicationContextHolder.getBean(Gson.class).toJson(response));
    }
}
