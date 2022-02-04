import configs.ApplicationContextHolder;
import ui.UserUI;

/**
 * @author Doston Bokhodirov, Fri 5:15 PM. 2/4/2022
 */
public class Application {
    private static final UserUI userUI = ApplicationContextHolder.getBean(UserUI.class);
    public static void main(String[] args) {
        userUI.get();
    }
}
