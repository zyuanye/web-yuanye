import com.yuanye.dao.mapper.Usermapper;
import com.yuanye.domain.UserDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * Created by QDHL on 2017/12/26.
 */
@ContextConfiguration( {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest {

    @Resource(name = "usermapper")
    private Usermapper usermapper;

    //查询
    @Test
    public void test() throws Exception {


        //传递user对象查询用户列表
        UserDTO user = usermapper.findUserinfobyphoneno("13071190227");
        //关闭session
        System.out.println(user.getUsername());

    }

    //插入数据

    @Test
    public void insertTest() throws Exception{

        UserDTO userDTO =new UserDTO();
        userDTO.setId(2);
        userDTO.setPassword("test");
        userDTO.setUsername("test");
        userDTO.setUserphoneno("1344444");
        usermapper.insertUser(userDTO);

    }
}

