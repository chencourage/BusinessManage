package com.yst.core.manager.service.impl;

import com.yst.core.manager.entity.FastPayUser;
import com.yst.core.manager.mapper.FastPayUserMapper;
import com.yst.core.manager.service.IFastPayUserService;
import com.yst.core.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 快捷支付用户状态表 服务实现类
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@Service
public class FastPayUserService extends BaseService<FastPayUserMapper, FastPayUser> implements IFastPayUserService {
	
}
