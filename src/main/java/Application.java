import configs.ApplicationContextHolder;
import ui.AuthUserUI;
import ui.DepartmentUI;
import ui.UserUI;
import uz.jl.utils.Input;
import uz.jl.utils.Print;

/**
 * @author Doston Bokhodirov, Fri 5:15 PM. 2/4/2022
 */
public class Application {
    private static final UserUI userUI = ApplicationContextHolder.getBean(UserUI.class);
    private static final AuthUserUI authUserUI = ApplicationContextHolder.getBean(AuthUserUI.class);
    private static final DepartmentUI departmentUI = ApplicationContextHolder.getBean(DepartmentUI.class);

    public static void main(String[] args) {

run();

    }

    public static void run(){

        Print.println("1. User Get");
        Print.println("2. User Delete");
        Print.println("3. User Create");
        Print.println("4. User Update");
        Print.println("5. LOGIN");
        Print.println("6. Users list");


        String choice = Input.getStr("Choose -> ");
        switch (choice){
            case "1" -> userUI.get();
            case "2" -> userUI.delete();
            case "3" -> userUI.create();
            case "4" -> userUI.update();
            case "5" -> authUserUI.login();
            case "6" -> userUI.getAll();
            case "7" -> userUI.logout();
            case "11" -> departmentUI.get();
            case "22" -> departmentUI.getAll();
            case "33" -> departmentUI.create();
            case "44" -> departmentUI.update();

        }
        run();
    }
}
