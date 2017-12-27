package com.yuanye.service.impl;

import com.yuanye.dao.mapper.Usermapper;
import com.yuanye.domain.UserDTO;
import com.yuanye.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by QDHL on 2017/12/22.
 */
@Service("userservice")
public  class UserServiceImpl extends UserService {
    @Resource(name = "usermapper")
    private Usermapper usermapper;
    @Override
    public Boolean login(String phoneno, String password) throws Exception {
        UserDTO userDTO= usermapper.findUserinfobyphoneno(phoneno);
        return true;
    }

    @Override
    public void register(UserDTO userDTO) throws Exception {

        usermapper.insertUser(userDTO);
    }


}
