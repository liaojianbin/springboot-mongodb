package cn.itcast.springboot.dao;

import cn.itcast.springboot.pojo.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    void update(User user);

    void deleteById(Long id);

    User findById(Long id);

    List<User> findAll();

    List<User> findByName(String name);
}
