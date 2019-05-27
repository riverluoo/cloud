package com.riverluoo.client.user.mapper;

import com.riverluoo.client.user.model.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @auther: wangyang
 * @since: 2019-05-27 15:45
 */
@Mapper
public interface UserMapper {

    @Select("select id,name from user where name = #{name}")
    List<UserBean> selectUser(String name);

}
