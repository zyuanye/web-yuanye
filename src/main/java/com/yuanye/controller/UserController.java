package com.yuanye.controller;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.yuanye.dao.mapper.Usermapper;
import com.yuanye.domain.UserDTO;
import com.yuanye.entity.UserEntity;
import com.yuanye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by QDHL on 2017/12/22.
 */
@Controller
//这个控制器是接受user_reg页面传过来的参数去操作数据库
public class UserController {
    @Resource(name = "usermapper")
   private Usermapper usermapper;

   @Resource(name = "userservice")
   public UserService userService;
   @Autowired
   private HttpServletRequest req;
    /*     @RequestMapping("/userReg.action")
       //jsp页面通过userReg.action找到这个方法
    /*   public String userReg(UserEntity user){
           Map<String,String> map = new HashMap<String, String>();
           map.put("phone_mobile", user.getPhoneno());
           map.put("login_password", user.getPassword());

           //判断页面传回的数据要求
           Pattern pattern = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[01236789]))\\d{8}$");
           Matcher matcher = pattern.matcher(user.getPhoneno());
           if(user.getPhoneno()==null || user.getPassword()==null || !matcher.matches()){
               return "index.jsp";
           }

           //获取当前注册时间
           Date date = new Date();
           DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           map.put("register_time", df.format(date));

           //生成唯一识别码
           String s = UUID.randomUUID().toString();
           String user_code =  s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
           map.put("user_code", user_code);

           //将数据添加到数据库中
           int a = usermapper.saveUser(map);

           req.setAttribute("phone_mobile", user.getPhoneno());
           req.setAttribute("login_password", user.getPassword());
           return "pages/register_success.jsp";
       }


       //处理用户名唯一性的判断
       @RequestMapping("/userJudge.action")
       @ResponseBody
       public List<UserDTO> userJudge(String phone_mobile) {
           List<UserDTO> u = usermapper.getUserinfobyphone(phone_mobile);
        //   System.out.println(u.getPhoneno());
           return u;
       }
   */
    //用户登录的判断
    @RequestMapping("/userLogin.action")
    public Boolean userLogin(String phone_mobile,String login_password) throws Exception {

        Boolean userLogin = userService.login(phone_mobile, login_password);
        return  userLogin;
    }


 /*   //用户退出销毁session 跳转到登录页
    @RequestMapping("/userExit.action")
    public String userExit(HttpSession session){
        session.invalidate();
        return "index.jsp";
    }*/
}
