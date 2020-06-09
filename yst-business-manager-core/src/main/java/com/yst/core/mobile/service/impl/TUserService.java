package com.yst.core.mobile.service.impl;

import com.yst.core.mobile.entity.TUser;
import com.yst.core.mobile.mapper.TUserMapper;
import com.yst.core.mobile.service.ITUserService;
import com.yst.core.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户级别表 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2018-07-17
 */
@Service
public class TUserService extends BaseService<TUserMapper, TUser> implements ITUserService {
	
}
