package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 30);
        userService.saveUser("Петр", "Петров", (byte) 25);
        userService.saveUser("Анна", "Сидорова", (byte) 20);
        userService.saveUser("Мария", "Кузнецова", (byte) 35);

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
