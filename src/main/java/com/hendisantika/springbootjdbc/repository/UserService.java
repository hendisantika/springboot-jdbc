package com.hendisantika.springbootjdbc.repository;

import com.hendisantika.springbootjdbc.domain.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jdbc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-01
 * Time: 07:25
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    User create(final User user);

    List<User> findAll();

    User findUserById(int id);
}
