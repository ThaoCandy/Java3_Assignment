package service;

import entity.Users;
import java.util.List;

public interface UsersService<T> {
    List<T> getAllUsers();

    String updateUsers(T users);

    String deleteUsers(String ma);

    String addUsers(T diem);
}
