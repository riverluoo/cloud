package com.riverluoo.client.user.model.bean;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * @auther: wangyang
 * @since: 2019-05-27 15:38
 */
@Data
public class UserBean extends Model<UserBean> {
    private String id;

    private String name;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
