package hiber.dao;

import hiber.model.User;
import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> listUsers();

    //найти владельца машины по model + series
    User findUserByCar(String model, int series);
}