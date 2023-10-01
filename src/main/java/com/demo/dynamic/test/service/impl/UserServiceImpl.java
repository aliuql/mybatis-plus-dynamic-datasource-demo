package com.demo.dynamic.test.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.dynamic.test.entity.User;
import com.demo.dynamic.test.mapper.UserMapper;
import com.demo.dynamic.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author 笑小枫
 * @since 2023-08-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @DS("test")
    @Transactional(rollbackFor = Exception.class)
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }
}
