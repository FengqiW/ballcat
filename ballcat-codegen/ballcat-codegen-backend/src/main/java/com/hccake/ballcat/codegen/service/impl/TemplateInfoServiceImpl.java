package com.hccake.ballcat.codegen.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hccake.ballcat.codegen.mapper.TemplateInfoMapper;
import com.hccake.ballcat.codegen.model.entity.TemplateInfo;
import com.hccake.ballcat.codegen.service.TemplateInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 模板信息
 *
 * @author hccake
 * @date 2020-06-18 18:32:51
 */
@Service
public class TemplateInfoServiceImpl extends ServiceImpl<TemplateInfoMapper, TemplateInfo>
		implements TemplateInfoService {

	private final static String TABLE_ALIAS_PREFIX = "gt.";

	/**
	 * List template info list.
	 * @param templateGroupId the template group id
	 * @return the list
	 */
	@Override
	public List<TemplateInfo> listTemplateInfo(Integer templateGroupId) {
		return baseMapper
				.selectList(Wrappers.<TemplateInfo>lambdaQuery().eq(TemplateInfo::getGroupId, templateGroupId));
	}

}
