package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 30);
        userService.saveUser("Петр", "Петров", (byte) 25);
        userService.saveUser("Анна", "Сидорова", (byte) 20);
        userService.saveUser("Мария", "Кузнецова", (byte) 35);

        logger.info("All users: " + userService.getAllUsers());

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
