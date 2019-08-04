package com.fei.service;

import com.fei.entity.Users;

import java.util.Collection;

/**
 * @author feixiaoteng
 * @create 2019-08-03 17:14
 */
public interface UsersService {
    Collection<Users> list();

    Users get(Long id);
    void add(Users users);
}
