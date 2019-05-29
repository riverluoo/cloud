package com.riverluoo.client.user.controller;

import com.riverluoo.client.user.model.request.LoginRequest;
import com.riverluoo.client.user.service.UserService;
import com.riverluoo.common.controller.BaseController;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @auther: wangyang
 * @since: 2019-05-27 15:49
 */
@RestController
@RequestMapping(value = "user/")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户登录")
    @PostMapping(value = "login")
    public Object login(@RequestBody LoginRequest request) {

        return userService.login(request);

    }

}
