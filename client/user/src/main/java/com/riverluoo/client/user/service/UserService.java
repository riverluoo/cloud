package com.riverluoo.client.user.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.riverluoo.client.user.mapper.UserMapper;
import com.riverluoo.client.user.model.bean.UserBean;
import com.riverluoo.client.user.model.request.LoginRequest;
import com.riverluoo.common.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @auther: wangyang
 * @since: 2019-05-27 15:47
 */

@Transactional(rollbackFor = Exception.class)
@Service
public class UserService extends BaseService {

    @Autowired
    private UserMapper userMapper;

    public List<UserBean> login(LoginRequest loginRequest) {

        return userMapper.selectList(new EntityWrapper<UserBean>().eq("name", loginRequest.getName()));
    }

    ;

}
