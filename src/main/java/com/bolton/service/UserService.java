package com.bolton.service;

import com.bolton.model.Post;
import com.bolton.model.User;

import java.util.List;

/**
 * @author Sandaru Anjana <sandaruanjana@outlook.com>
 */
public interface UserService {
    User login(String email, String password);

    boolean register(String name, String email, String password);

    boolean follow(String email);

    boolean unfollow(String email);

    void post(String content);

    User findUserByEmail(String email);

    void logout();

    List<Post> getPosts();

    List<User> getAllUsers();
}
