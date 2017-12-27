package com.yuanye.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yuanye.dao.mapper.Usermapper;
import com.yuanye.domain.UserDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by QDHL on 2017/12/22.
 */
@Service
public  abstract class UserService {

    @Resource(name = "usermapper")
    private Usermapper usermapper;

    public abstract Boolean login(String phoneno, String password) throws Exception;
    public abstract void register(UserDTO userDTO) throws Exception;
}

