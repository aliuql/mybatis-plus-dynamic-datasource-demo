package com.demo.dynamic.test.service.impl;

import com.demo.dynamic.test.entity.User;
import com.demo.dynamic.test.mapper.UserMapper;
import com.demo.dynamic.test.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

    @Override
    public User selectById2(Long id) {
        return baseMapper.selectById2(id);
    }
}
