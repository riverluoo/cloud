package com.riverluoo.client.user.model.response;

import com.riverluoo.common.model.response.BaseResponse;
import lombok.Data;

/**
 * @auther: wangyang
 * @since: 2019-05-27 15:44
 */
@Data
public class TokenResponse extends BaseResponse {
    private String token;
}
