package com.demo.dynamic.test.mapper;

import com.demo.dynamic.test.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author 笑小枫
 * @since 2023-08-21
 */
public interface UserMapper extends BaseMapper<User> {

    User selectById2(Long id);

}
