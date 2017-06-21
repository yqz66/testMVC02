package cn.bdqn.tangcco.user.services;

import cn.bdqn.tangcco.entity.Tbuser;

import java.util.List;

/**
 * Created by Administrator on 2017/5/31.
 */
public interface TbuserServices {
    Tbuser login(Tbuser tbuser);

    List<Tbuser> queryAllUser();

    int addUser(Tbuser tbuser);
}
