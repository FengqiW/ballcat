package com.hccake.ballcat.admin.modules.lov.model.Vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.hccake.ballcat.admin.modules.lov.enums.HttpMethod;
import com.hccake.ballcat.admin.modules.lov.enums.HttpParamsPosition;
import com.hccake.ballcat.admin.modules.lov.model.entity.LovBody;
import com.hccake.ballcat.admin.modules.lov.model.entity.LovSearch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * @author lingting 2020-08-12 21:35
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "lov vo")
public class LovVo {

	@ApiModelProperty("关键字，唯一，加载lov数据时通过关键字加载")
	private String keyword;

	@NotBlank
	@ApiModelProperty("获取数据时请求路径")
	private String url;

	@NotBlank
	@ApiModelProperty("http请求方式")
	private HttpMethod method;

	@NotBlank
	@ApiModelProperty("http请求参数位置")
	private HttpParamsPosition position;

	@TableField("`key`")
	@ApiModelProperty("数据的key")
	private String key;

	@Pattern(regexp = "^\\{.*}")
	@ApiModelProperty("固定请求参数，请设置 jsonString, 默认值 {}")
	private String fixedParams;

	@ApiModelProperty("是否需要多选")
	private Boolean multiple;

	@ApiModelProperty("是否需要搜索框")
	private Boolean search;

	@ApiModelProperty("是否需要返回数据, false则不会有确定按钮")
	private Boolean ret;

	@ApiModelProperty("返回数据的字段")
	private String retField;

	@ApiModelProperty("返回字段数据类型 1 String 2 Number")
	private Integer retFieldDataType;

	private List<LovBody> bodyList;

	private List<LovSearch> searchList;

}
