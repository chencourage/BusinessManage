package com.yst.core.manager.service.impl;

import com.yst.core.manager.entity.YstCompanyCashback;
import com.yst.core.manager.mapper.YstCompanyCashbackMapper;
import com.yst.core.manager.service.IYstCompanyCashbackService;
import com.yst.core.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公司返现表，所有金额单位均为分（c_acc00：直营00户，c_purse：直营钱包，s_acc00：直签00户，s_acc11：直签11户，s_purse：直签钱包，total：总共返现金额） 服务实现类
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
@Service
public class YstCompanyCashbackService extends BaseService<YstCompanyCashbackMapper, YstCompanyCashback> implements IYstCompanyCashbackService {
	
}
