package com.fei.service.impl;

import com.fei.entity.Users;
import com.fei.service.UsersService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author feixiaoteng
 * @create 2019-08-03 17:14
 */
@Service
public class UsersServiceImpl implements UsersService {
    private Map<Long,Users> map = new HashMap<Long, Users>();

    public UsersServiceImpl() {
        map.put(1L,new Users(1L,"代腾飞","123456"));
        map.put(2L,new Users(2L,"许芳晴","123456"));
        map.put(3L,new Users(3L,"陈思颖","123456"));
        map.put(4L,new Users(4L,"王晗","123456"));
        map.put(5L,new Users(5L,"王亚晴","123456"));
        map.put(6L,new Users(6L,"张强","123456"));
    }

    public Collection<Users> list(){
        return map.values();
    }

    public Users get(Long id){
        return map.get(id);
    }

    public void add(Users users) {
        Long id = map.size()+1L;
        users.setId(id);
        map.put(id,users);
    }
}
