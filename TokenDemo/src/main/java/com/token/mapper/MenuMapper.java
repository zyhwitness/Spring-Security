package com.token.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.token.domain.Menu;

import java.util.List;

/**
 * @Description: TODO
 * @Author: iWitness
 * @Date: 2024/5/28 17:08
 * @Version 1.0
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<String> selectPermsByUserId(Long userId);

}
