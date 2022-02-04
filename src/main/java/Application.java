import configs.ApplicationContextHolder;
import ui.AuthUserUI;
import ui.DepartmentUI;
import ui.UserUI;

/**
 * @author Doston Bokhodirov, Fri 5:15 PM. 2/4/2022
 */
public class Application {
    private static final UserUI userUI = ApplicationContextHolder.getBean(UserUI.class);
    private static final AuthUserUI authUserUI = ApplicationContextHolder.getBean(AuthUserUI.class);
    private static final DepartmentUI departmentUI = ApplicationContextHolder.getBean(DepartmentUI.class);

    public static void main(String[] args) {
//        userUI.get();
        authUserUI.login();
        departmentUI.get();
        departmentUI.getAll();
//        departmentUI.create();
//        departmentUI.update();
//        departmentUI.block();
//        departmentUI.unblock();
//        departmentUI.delete();
    }
}
