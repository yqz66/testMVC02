package cn.bdqn.tangcco.user.services.impl;

import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.user.dao.TbuserMapper;
import cn.bdqn.tangcco.user.services.TbuserServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/31.
 */
@Service
public class TbuserServicesImpl implements TbuserServices {
    @Resource
    private TbuserMapper tbuserMapper;
    @Override
    public Tbuser login(Tbuser tbuser) {
        return tbuserMapper.login(tbuser);
    }

    @Override
    public List<Tbuser> queryAllUser() {
        return tbuserMapper.selectByExample(null);
    }

    @Override
    public int addUser(Tbuser tbuser) {
        return tbuserMapper.insertSelective(tbuser);
    }
}
