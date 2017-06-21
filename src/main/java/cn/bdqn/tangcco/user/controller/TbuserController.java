package cn.bdqn.tangcco.user.controller;

import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.user.services.TbuserServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/5/31.
 */
@Controller
public class TbuserController {
    @Resource
    private TbuserServices tbuserServices;
    @RequestMapping(value = "/login.controller",method = RequestMethod.POST)
    public String login(Tbuser user, Model model, HttpSession session){
        user = tbuserServices.login(user);
        if (user!=null){
            model.addAttribute("userlist",tbuserServices.queryAllUser());
            session.setAttribute("user",user);
            return "user/login";
        }
        model.addAttribute("msg","对不起账号密码错误!");
        return "../../index";
    }
    @ResponseBody
    @RequestMapping(value = "/addUser.controller",method = RequestMethod.GET)
    public String addUser(Tbuser user){
        if (tbuserServices.addUser(user)>0){
            return "1";
        }
        return "0";
    }

}
