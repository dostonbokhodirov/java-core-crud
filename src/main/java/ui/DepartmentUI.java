package ui;

import service.DepartmentService;
import ui.base.AbstractUI;

/**
 * @author Doston Bokhodirov, Fri 4:04 PM. 2/4/2022
 */
public class DepartmentUI extends AbstractUI<DepartmentService> {

    public DepartmentUI(DepartmentService service) {
        super(service);
    }
}
