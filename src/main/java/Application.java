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


        Print.println("1. User Get");
        Print.println("2. User Delete");
        Print.println("3. User Create");
        Print.println("4. User Update");

        String choice = Input.getStr("Choose -> ");
        switch (choice){
            case "1" -> userUI.get();
            case "2" -> userUI.delete();
            case "3" -> userUI.create();
            case "4" -> userUI.update();

        }
    }
}
