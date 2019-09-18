package com.riverluoo.client.user.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.riverluoo.client.user.model.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;


/**
 * @auther: wangyang
 * @since: 2019-05-27 15:45
 */
@Mapper
public interface UserMapper extends BaseMapper<UserBean> {


}
