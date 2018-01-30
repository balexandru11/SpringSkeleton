package org.spring.mvc.service.impl;

import org.spring.mvc.entity.User;
import org.spring.mvc.repository.UserRepository;
import org.spring.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



/**
 * @author balexandru
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User findByName(String name) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUserById(long id) {

    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public void deleteAllUsers() {

    }

    @Override
    public boolean isUserExist(User user) {
        return false;
    }
}
