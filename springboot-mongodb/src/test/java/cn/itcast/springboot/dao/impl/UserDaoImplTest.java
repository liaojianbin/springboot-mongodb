package cn.itcast.springboot.dao.impl;

import cn.itcast.springboot.dao.UserDao;
import cn.itcast.springboot.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserDaoImplTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void save() {
        User user = new User(123L, "传智播客", 12, "男", "北京");
        userDao.save(user);
    }

    @Test
    public void update() {
        User user = new User(123L, "黑马程序员", 12, "男", "广州");
        userDao.update(user);
    }

    @Test
    public void deleteById() {
        userDao.deleteById(123L);
    }

    @Test
    public void findById() {
        User user = userDao.findById(123L);
        System.out.println(user);
    }

    @Test
    public void findAll() {
        List<User> userList = userDao.findAll();
        if (userList != null && userList.size() > 0) {
            for (User user : userList) {
                System.out.println(user);
            }
        }
    }

    @Test
    public void findByName() {
        List<User> userList = userDao.findByName("黑马");
        if (userList != null && userList.size() > 0) {
            for (User user : userList) {
                System.out.println(user);
            }
        }
    }
}