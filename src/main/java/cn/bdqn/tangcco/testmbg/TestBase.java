package cn.bdqn.tangcco.testmbg;

import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.user.services.TbuserServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:WEB-INF/applicationContext.xml"})
public class TestBase {
    @Resource
    private TbuserServices tbuserServices;
    @Test
    public void testLogin(){
        System.out.println(tbuserServices.login(new Tbuser("admin","123")));
    }
}
