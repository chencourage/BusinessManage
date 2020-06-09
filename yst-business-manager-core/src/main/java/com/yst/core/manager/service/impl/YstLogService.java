package com.yst.core.manager.service.impl;

import com.yst.core.manager.entity.YstLog;
import com.yst.core.manager.mapper.YstLogMapper;
import com.yst.core.manager.service.IYstLogService;
import com.yst.core.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志表 服务实现类
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@Service
public class YstLogService extends BaseService<YstLogMapper, YstLog> implements IYstLogService {
	
}
