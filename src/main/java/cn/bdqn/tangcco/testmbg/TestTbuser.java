package cn.bdqn.tangcco.testmbg;

import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.user.services.TbuserServices;
import org.junit.Test;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/5/31.
 */
public class TestTbuser extends TestBase{
    @Inject
    private TbuserServices tbuserServices;
    @Test
    public void testLogin(){
        System.out.println(tbuserServices.login(new Tbuser("admin","123")));
    }

}
