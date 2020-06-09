package com.yst.core.manager.mapper;

import com.yst.core.manager.entity.YstCompanyCashback;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
  * 公司返现表，所有金额单位均为分（c_acc00：直营00户，c_purse：直营钱包，s_acc00：直签00户，s_acc11：直签11户，s_purse：直签钱包，total：总共返现金额） Mapper 接口
 * </p>
 *
 * @author chenkai
 * @since 2019-06-24
 */
public interface YstCompanyCashbackMapper extends BaseMapper<YstCompanyCashback> {

}