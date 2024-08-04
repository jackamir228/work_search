package com.example.work_search.repositories;

import com.example.work_search.models.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Getter
@Setter
@Repository
public class UserRepository {

    private List<User> users;

    public void add(User user) {
        users.add(user);
    }

    public void removeById(long id) {
        User deleableUser =
                users.stream()
                        .filter(user -> user.getId() == id)
                        .findFirst()
                        .orElseThrow(() -> new RuntimeException("не удалось удалить пользователя с id " + id));
    }

    public User findById(long id) {
        return users.stream()
                .filter(user -> user.getId() == id).findFirst()
                .orElseThrow(() -> new RuntimeException("Не удалось найти пользователя с id " + id));
    }

    public List<User> findAll() {
        return users;
    }

    public List<User> addAll(List<User> users) {
        this.users.addAll(users);
        return this.users;
    }

    public void clean() {
        this.users.clear();
    }


}
