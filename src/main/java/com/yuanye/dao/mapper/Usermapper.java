package com.yuanye.dao.mapper;

import com.yuanye.domain.UserDTO;
import org.springframework.stereotype.Repository;


/**
 * Created by QDHL on 2017/12/22.
 */

@Repository("usermapper")
   public interface   Usermapper  {

       UserDTO  findUserinfobyphoneno(String phoneno) throws Exception;
       void insertUser (UserDTO userDTO);

}
