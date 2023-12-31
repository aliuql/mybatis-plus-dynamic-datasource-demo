package com.demo.dynamic.test.service;

import com.demo.dynamic.test.entity.User;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author 笑小枫
 * @since 2023-08-21
 */
public interface IUserService {
    User getUserById(Long id);
}
